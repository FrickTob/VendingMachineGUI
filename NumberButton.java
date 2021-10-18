package vendingMachine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumberButton extends JButton implements ActionListener {

	private static final long serialVersionUID = 3985344756928858755L;
	
	private JButton button;
	
	public NumberButton(int i) {
		button = new JButton("" + i);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
