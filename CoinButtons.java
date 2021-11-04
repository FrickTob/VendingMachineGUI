package vendingMachine;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author tobyf
 *
 */
public class CoinButtons extends JPanel {
	
	private static final long serialVersionUID = -3807629211843592326L;
	
	private JButton bill;
	private JButton quarter;
	private JButton dime;
	private JButton nickel;
	private JPanel panel;
	
	/**
	 * Constructor to create the four coin buttons
	 */
	public CoinButtons() {
		panel.setBorder(BorderFactory.createEmptyBorder());
		panel.setLayout(new GridLayout(4, 1));
		bill.setText("Bill");
		bill.setBackground(Color.green);
		quarter.setText("Quarter");
		quarter.setBackground(Color.gray);
		dime.setText("Dime");
		dime.setBackground(Color.gray);
		nickel.setText("Nickel");
		nickel.setBackground(Color.gray);

	}

}
