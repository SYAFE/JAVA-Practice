package ch04;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
	GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(2, 3, 5, 10));  // 행 수, 열 수, 행 간격, 열 간격
		
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		add(new JButton("버튼6"));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
