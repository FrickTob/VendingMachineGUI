package vendingMachine;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CoinButtons extends JPanel {
	
	private static final long serialVersionUID = -3807629211843592326L;
	
	JButton bill;
	JButton quarter;
	JButton dime;
	JButton nickel;
	JPanel panel;
	
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
