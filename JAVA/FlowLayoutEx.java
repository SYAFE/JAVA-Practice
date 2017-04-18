package ch04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(null);
		JButton b1 = new JButton("��ư1");
		b1.setSize(100, 50);
		b1.setLocation(20, 10);
		add(b1);
		
		JButton b2 = new JButton("��ư2");
		b2.setBounds(100, 100, 70, 25);  // ������� ��ġ��ǥ
		add(b2);
		

		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
