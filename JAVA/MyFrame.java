package ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	// ������
	public MyFrame() {
		setTitle("������ ���� ver0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLocation(300,300);  // â�� ����� ��ǥ
		setLayout(new FlowLayout());
		
		// �ڵ� �Է�
		JButton b = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
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
