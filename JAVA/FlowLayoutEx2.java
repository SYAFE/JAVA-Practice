package ch04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {
	FlowLayoutEx2() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		

		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
