package midi_Swing;
 

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class screen2 implements ActionListener {
	JButton button;

	public static void main(String args[]){
		 screen2 s2 = new screen2();
		 s2.go();
	}
		 public void go(){
			 
		 
	JFrame frame = new JFrame();
	 panel Mypanel = new panel();
    button = new JButton("On Click");
    button.addActionListener(this);
	frame.getContentPane().add(button);
	frame.setSize(330, 240);
	frame.setVisible(true);
	
	 
	 
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			button.setText("I have been clicked");
		}
	
	 
	 class 	panel extends JPanel{
		 
	 }
}

