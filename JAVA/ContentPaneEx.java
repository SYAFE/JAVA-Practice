package ch04;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	JButton okBtn;
	
	ContentPaneEx() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		okBtn = new JButton("OK");
		contentPane.add(okBtn);
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350,150);
		setVisible(true);
		

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}

