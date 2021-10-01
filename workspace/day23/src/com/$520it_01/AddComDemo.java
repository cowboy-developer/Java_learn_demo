package com.$520it_01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddComDemo {
	public static void main(String[] args) {
		//创建一个窗体
		JFrame frame = new JFrame("Android");
		//设置窗体的位置和大小    设置在屏幕的正中间    500*300
		//获取屏幕的大小
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension size = toolkit.getScreenSize();
		int width = size.width;
		int height = size.height;
		int x = (width - 500) / 2;
		int y = (height - 300) / 2;
		
		//前两个参数指的是屏幕的坐标,后两个是大小
		frame.setBounds(x, y, 500, 300);
		//设置默认的关闭动作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		work5(frame);

		//设置窗体可见
		frame.setVisible(true);
	}

	private static void work5(JFrame frame) {
		//绝对定位
//		清空布局管理，开启绝对定位
		frame.setLayout(null);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		//明确说明组件的位置和大小
		btn1.setBounds(190, 95, 200, 100);
		btn2.setBounds(180, 75, 150, 100);
		
		frame.add(btn1);
		frame.add(btn2);
	}

	private static void work4(JFrame frame) {
		//把一下组件装到Box组件中
		//水平的左往右
		Box box = Box.createHorizontalBox();
		//垂直方向的盒子
//		Box box = Box.createVerticalBox();
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		
		box.add(btn1);
		box.add(btn2);
		box.add(btn3);
		box.add(btn4);
		box.add(btn5);
		
		frame.add(box);
	}

	private static void work3(JFrame frame) {
		//流式布局  参数是对其的方式
		LayoutManager manager = new FlowLayout(FlowLayout.CENTER);
		frame.setLayout(manager);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
	}

	private static void work2(JFrame frame) {
		//网格布局
		LayoutManager manager = new GridLayout(3, 3);
		//设置布局管理器  会自动的调整行和列,使得尽量平均
		frame.setLayout(manager);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
	}

	private static void work1(JFrame frame) {
		//创建一个边框布局
		LayoutManager manager = new BorderLayout(3,3);
		//设置布局管理器
		frame.setLayout(manager);
		
		JButton btn1 = new JButton("东");
		JButton btn2 = new JButton("南");
		JButton btn3 = new JButton("西");
		JButton btn4 = new JButton("北");
		JButton btn5 = new JButton("中");
		frame.add(btn1, BorderLayout.EAST);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.NORTH);
		frame.add(btn5, BorderLayout.CENTER);
	}
}
