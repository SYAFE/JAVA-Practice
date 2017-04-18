package ch05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerSample extends JFrame implements ActionListener {
	JButton b1, b2;
	
	ListenerSample () {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// 여기에 코드를 작성하세요.
		b1 = new JButton("Action");
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Test");
		b2.addActionListener(this);
		add(b2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ListenerSample ();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == b1)
		{
			if(b1.getText().equals("Action"))
			{
				b1.setText("액션");
			}
			else
			{
				b1.setText("Action"); 
			}
		}
		else if(obj == b2) 
		{
			getContentPane().setBackground(Color.green); 
		}
	}
} 
