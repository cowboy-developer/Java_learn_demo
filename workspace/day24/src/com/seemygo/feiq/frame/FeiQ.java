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
 * feiQ�Ĵ���
 * @author ��ң
 *
 */
public class FeiQ  extends JFrame implements IShowUIListener {
	private static final long serialVersionUID = -4339596418203497082L;
	
	//���������
	private JScrollPane readPane;
	private JTextArea readArea;
	
	private JScrollPane writePane;
	private JTextArea writeArea;

	private JLabel label;

	private JTextField field;
	
	private JButton sendBtn;
	private JButton closeBtn;
	
	//����һ������ӿ�
	private IFeiqService service;

	public FeiQ() {
		initCompont();
		
		initFrame();
		
		addListeners();
		
		//��ʼ�������˷��͹���������
		service = new FeiServiceImpl(this);
		service.accept();
	}

	private void addListeners() {
		//����ť��Ӽ�����
		closeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		sendBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�������ļ��������
				String data = writeArea.getText().trim();
				String ip = field.getText().trim();
				if (data.length() > 0 && ip.length() > 0) {
					//ͨ�����緢�����ݳ�ȥ
					service.send(new Data(ip, data));
					writeArea.setText("");
					//���������¼
					readArea.append(String.format("��--->%s\n", data));
				}
			}
		});
		
		//���ı�����Ӽ����¼�
		writeArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//���س���������
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					//��������  �ñ����������¼�
					sendBtn.doClick();
				}
			}
		});
	}

	private void initFrame() {
		//��ʼ���������ʾ
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
		//������
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
		//����ĳ�ʼ�����ڵ�һλ
		readArea = new JTextArea();
		//�Զ�/�Զ�����
		readArea.setLineWrap(true);
		readArea.setEditable(false);
		readPane = new JScrollPane(readArea);
		
		writeArea = new JTextArea();
		writeArea.setLineWrap(true);
		writePane = new JScrollPane(writeArea);
		
		label = new JLabel("IP:");
		
		field = new JTextField();
		
		sendBtn = new JButton("����");
		closeBtn = new JButton("�ر�");
	}

	@Override
	public void updateUI(Data data) {
		readArea.append(String.format("%s===>%s\n", data.getIp(), data.getData()));
	}
}
