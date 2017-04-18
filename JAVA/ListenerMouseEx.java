package ch05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerMouseEx extends JFrame implements MouseListener, ActionListener {
	JButton btn;
	boolean flag = false;
	
	ListenerMouseEx() {
		setTitle("버튼에 MOUSE 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		btn.addMouseListener(this);
		btn.addActionListener(this);
		
		
		add(btn);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ListenerMouseEx();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if(obj == btn)
			btn.setBackground(Color.RED);
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if(obj == btn)
			btn.setBackground(Color.YELLOW);
		
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn) {
			if(flag)
			{
				getContentPane().setBackground(Color.BLUE);
				flag = false;
			}
			else
			{
				getContentPane().setBackground(Color.RED);
				flag = true;
			}
		}
	}
}