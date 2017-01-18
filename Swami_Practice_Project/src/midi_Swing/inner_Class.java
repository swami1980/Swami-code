package midi_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class inner_Class {

	JButton button1;
	JButton button2;
	
	inner_classA ia = new inner_classA();
	inner_classB ib = new inner_classB();
	public static void main(String[] args) {
		inner_Class ic = new inner_Class();
		ic.go();
		// TODO Auto-generated method stub

	}
	public void go(){
		JFrame frame = new JFrame();
		 button1 = new JButton("First one");
		 button2 = new JButton("Second");
		frame.getContentPane().add(BorderLayout.NORTH ,button1);
		frame.getContentPane().add(BorderLayout.SOUTH, button2);
		frame.setSize(330, 240);
		frame.setVisible(true);
		
		button1.addActionListener( ia);
		button2.addActionListener(ib);
		
		
		
	}
class inner_classA implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    		button1.setText("First was clicked");
	}
	
}
class inner_classB implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button2.setText("Second was clicked");
	}
	
}
}
