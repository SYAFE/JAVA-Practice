package ch04;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout(10,20));  // 레이아웃 간격
		add(new JButton("버튼1"), BorderLayout.NORTH);
		add(new JButton("버튼2"), BorderLayout.EAST);
		add(new JButton("버튼3"), BorderLayout.WEST);
		add(new JButton("버튼4"), BorderLayout.SOUTH);
		add(new JButton("버튼5"), BorderLayout.CENTER);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
