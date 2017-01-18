package midi_Swing;
 

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class screen1 implements ActionListener {

	public static void main(String args[]){
		 Container c = new Container();
		  
	JFrame frame = new JFrame();
	JButton button = new JButton("Click me ");
	frame.getContentPane().add(button);
	frame.setSize(330, 240);
	frame.setVisible(true);
	
	
	 
	}
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		 
		// TODO Auto-generated method stub
		
	}
}
