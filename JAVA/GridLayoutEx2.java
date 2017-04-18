package ch04;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx2 extends JFrame {
	GridLayoutEx2() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		GridLayout grid = new GridLayout(5,2);
		grid.setVgap(5);
		setLayout(grid);
		
		add(new JLabel(" �̸�"));
		add(new JTextField(""));
		add(new JLabel(" �й�"));
		add(new JTextField(""));
		add(new JLabel(" �а�"));
		add(new JTextField(""));
		add(new JLabel(" ����"));
		add(new JTextField(""));
		add(new JLabel(" ����"));
		add(new JTextField(""));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx2();
	}
}
