package ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	// 생성자
	public MyFrame() {
		setTitle("프레임 연습 ver0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLocation(300,300);  // 창이 생기는 좌표
		setLayout(new FlowLayout());
		
		// 코드 입력
		JButton b = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		Container c = getContentPane();
		c.add(b);
		c.add(b2);
		
		setLocationRelativeTo(null);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
		
	}

}
