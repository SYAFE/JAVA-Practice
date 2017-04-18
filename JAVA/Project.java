package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project extends JFrame {
	JPanel leftPanel;
	JPanel rightPanel;
	JPanel Middle;
	JPanel Bottom;
	
	JLabel lbName, lbNum, rbName;
	JTextField tfName, tfNum;
	JButton btn2;
	JCheckBox rcb1, rcb2;
	
	public Project() {
		
		
		setTitle("Container & Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10, 10));
		setSize(400,300);
		
		Middle = new JPanel();
		add(Middle);
		Middle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		Middle.setSize(300, 200);
		
		
		leftPanel = new JPanel();
		Middle.add(leftPanel);
		leftPanel.setLayout(new FlowLayout());
		leftPanel.setBackground(Color.yellow);
		leftPanel.setPreferredSize(new Dimension(180, 167));
		
		
		lbName = new JLabel("Type ID");
		lbName.setPreferredSize(new Dimension(150, 25));
		lbName.setHorizontalAlignment(JLabel.CENTER);
		tfName = new JTextField("");
		tfName.setPreferredSize(new Dimension(150, 25));
		lbNum = new JLabel("Type Password");
		lbNum.setPreferredSize(new Dimension(150, 25));
		lbNum.setHorizontalAlignment(JLabel.CENTER);
		tfNum = new JTextField("");
		tfNum.setPreferredSize(new Dimension(150, 25));
		
		leftPanel.add(lbName);
		leftPanel.add(tfName);
		leftPanel.add(lbNum);
		leftPanel.add(tfNum);
		
		
		rightPanel = new JPanel();
		Middle.add(rightPanel);	
		rightPanel.setLayout(new FlowLayout());
		rightPanel.setBackground(Color.RED);
		rightPanel.setPreferredSize(new Dimension(180,167));
		
		rbName = new JLabel("Please Check!!");
		rbName.setPreferredSize(new Dimension(150, 25));
		rbName.setHorizontalAlignment(JLabel.CENTER);
		rcb1 = new JCheckBox("C# JCheckBox");
		rcb1.setPreferredSize(new Dimension(150, 25));
		rcb1.setHorizontalAlignment(JCheckBox.CENTER);
		rcb2 = new JCheckBox("C++ JCheckBox");
		rcb2.setPreferredSize(new Dimension(150, 25));
		rcb2.setHorizontalAlignment(JCheckBox.CENTER);
		
		rightPanel.add(rbName);
		rightPanel.add(rcb1);
		rightPanel.add(rcb2);
		
		
		Bottom = new JPanel();
		add(Bottom);
		Bottom.setLayout(new FlowLayout());
		
		btn2 = new JButton("OK");
		btn2.setSize(100,40);
		
		Bottom.add(btn2);
		
		this.add(Middle, BorderLayout.NORTH);
		this.add(Bottom, BorderLayout.SOUTH);
		
		setSize(400, 260);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Project();
		
	}

}
