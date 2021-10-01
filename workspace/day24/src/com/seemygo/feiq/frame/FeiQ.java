package com.seemygo.feiq.frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.seemygo.feiq.listener.IShowUIListener;
import com.seemygo.feiq.pojo.Data;
import com.seemygo.feiq.service.IFeiqService;
import com.seemygo.feiq.service.impl.FeiServiceImpl;

/**
 * feiQ的窗口
 * @author 逍遥
 *
 */
public class FeiQ  extends JFrame implements IShowUIListener {
	private static final long serialVersionUID = -4339596418203497082L;
	
	//包含的组件
	private JScrollPane readPane;
	private JTextArea readArea;
	
	private JScrollPane writePane;
	private JTextArea writeArea;

	private JLabel label;

	private JTextField field;
	
	private JButton sendBtn;
	private JButton closeBtn;
	
	//包含一个服务接口
	private IFeiqService service;

	public FeiQ() {
		initCompont();
		
		initFrame();
		
		addListeners();
		
		//开始监听别人发送过来的数据
		service = new FeiServiceImpl(this);
		service.accept();
	}

	private void addListeners() {
		//给按钮添加监听器
		closeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取到输入文件域的数据
				String data = writeArea.getText().trim();
				String ip = field.getText().trim();
				if (data.length() > 0 && ip.length() > 0) {
					//通过网络发送数据出去
					service.send(new Data(ip, data));
					writeArea.setText("");
					//回显聊天记录
					readArea.append(String.format("我--->%s\n", data));
				}
			}
		});
		
		//给文本域添加键盘事件
		writeArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//按回车发送数据
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					//发送数据  用编程驱动点击事件
					sendBtn.doClick();
				}
			}
		});
	}

	private void initFrame() {
		//初始化窗体的显示
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int w = 403;
		int h = 410;

		int x = size.width - w >>> 1;
		int y = size.height - h >>> 1;
		setBounds(x, y, w, h);
		
		readPane.setBounds(5, 5, 375, 200);
		
		writePane.setBounds(5, 210, 375, 100);
		
		label.setBounds(18, 323, 30, 30);
		
		field.setBounds(38, 325, 150, 25);
		
		sendBtn.setBounds(320, 325, 60, 30);
		closeBtn.setBounds(250, 325, 60, 30);
		//添加组件
		setLayout(null);
		
		add(readPane);
		add(writePane);
		add(label);
		add(field);
		add(sendBtn);
		add(closeBtn);
		
		setTitle("feiq");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initCompont() {
		//组件的初始化放在第一位
		readArea = new JTextArea();
		//自读/自动换行
		readArea.setLineWrap(true);
		readArea.setEditable(false);
		readPane = new JScrollPane(readArea);
		
		writeArea = new JTextArea();
		writeArea.setLineWrap(true);
		writePane = new JScrollPane(writeArea);
		
		label = new JLabel("IP:");
		
		field = new JTextField();
		
		sendBtn = new JButton("发送");
		closeBtn = new JButton("关闭");
	}

	@Override
	public void updateUI(Data data) {
		readArea.append(String.format("%s===>%s\n", data.getIp(), data.getData()));
	}
}
