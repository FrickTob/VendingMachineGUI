package vendingMachine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class VendingScreen implements ActionListener {
	
	private JFrame frame;
	private JPanel panelTop;
	private JPanel panelTopAndBottom;
	private JPanel panelBottom;
	JButton[] IDButtons;
	JButton[] coinButtons;
	JLabel label;
	JButton enterButton;
	JButton decimalButton;
	String currInput;
	Boolean seekingInput;
	
	
	public VendingScreen() {
		
		currInput = new String("");
		seekingInput = false;
		frame = new JFrame();
		
		IDButtons = new JButton[10];
		for(int i = 0; i < 10; i++) {
			IDButtons[i] = new JButton("" + i);
			IDButtons[i].addActionListener(this);
			IDButtons[i].setFocusPainted(false);
		}
		coinButtons = new JButton[4];
		coinButtons[0] = new JButton("Bill");
		coinButtons[0].setBackground(Color.decode("#118C4F"));
		coinButtons[0].addActionListener(this);
		coinButtons[0].setFocusPainted(false);
		coinButtons[1] = new JButton("Quarter");
		coinButtons[2] = new JButton("Dime");
		coinButtons[3] = new JButton("Nickel");
		for(int i = 1; i < 4; i++) {
			coinButtons[i].setBackground(Color.gray);
			coinButtons[i].addActionListener(this);
			coinButtons[i].setFocusPainted(false);
		}
		
		 decimalButton = new JButton(".");
		 decimalButton.addActionListener(this);
		 decimalButton.setFocusPainted(false);
		 
		 enterButton = new JButton("Enter");
		 enterButton.addActionListener(this);
		 enterButton.setFocusPainted(false);
		
		
		label = new JLabel("Vending Machine");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		label.setBackground(Color.BLACK);
		
		
			
		panelTop = new JPanel();
		panelTop.setBorder(BorderFactory.createEmptyBorder());
		panelTop.setLayout(new GridLayout(1, 1));
		panelTop.add(label);
		
		
		
		panelBottom = new JPanel();
		panelBottom.setBorder(BorderFactory.createEmptyBorder());
		panelBottom.setLayout(new GridLayout(4, 4));
		for(int i = 1; i < 4; i ++) {
			panelBottom.add(IDButtons[i]);
		}
		panelBottom.add(coinButtons[0]);
		for(int i = 4; i < 7; i ++) {
			panelBottom.add(IDButtons[i]);
		}
		panelBottom.add(coinButtons[1]);
		for(int i = 7; i < 10; i ++) {
			panelBottom.add(IDButtons[i]);
		}
		panelBottom.add(coinButtons[2]);
		panelBottom.add(decimalButton);
		panelBottom.add(IDButtons[0]);
		panelBottom.add(enterButton);
		panelBottom.add(coinButtons[3]);
		
		
		panelTopAndBottom = new JPanel();
		panelTopAndBottom.setLayout(new GridLayout(2, 1));
		panelTopAndBottom.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panelTopAndBottom.add(panelTop);
		panelTopAndBottom.add(panelBottom);
		
		
		
		frame.add(panelTopAndBottom, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void changeText(String s) {
		label.setText(s);
	}
	public String getInput() {
		return currInput;
	}
	
	public void toggleSeekingInput() {
		if(seekingInput) {
			seekingInput = false;
		}
		else
			seekingInput = true;
	}
	
	public void resetInput() {
		currInput = "";
	}
	
	public boolean getSeekingInput() {
		return seekingInput;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == IDButtons[0]) {
			currInput += 0;
		}
		else if (e.getSource() == IDButtons[1]) {
			currInput += 1;
		}
		else if (e.getSource() == IDButtons[2]) {
			currInput += 2;
		}
		else if (e.getSource() == IDButtons[3]) {
			currInput += 3;
		}
		else if (e.getSource() == IDButtons[4]) {
			currInput += 4;
		}
		else if (e.getSource() == IDButtons[5]) {
			currInput += 5;
		}
		else if (e.getSource() == IDButtons[6]) {
			currInput += 6;
		}
		else if (e.getSource() == IDButtons[7]) {
			currInput += 7;
		}
		else if (e.getSource() == IDButtons[8]) {
			currInput += 8;
		}
		else if (e.getSource() == IDButtons[9]) {
			currInput += 9;
		}
		else if (e.getSource() == decimalButton) {
			currInput += ".";
		}
		else if (e.getSource() == enterButton) {
			toggleSeekingInput();
		}
		else if (e.getSource() == coinButtons[0])
			currInput = "bill";
		else if (e.getSource() == coinButtons[1])
			currInput = "quarter";
		else if (e.getSource() == coinButtons[2])
			currInput = "dime";
		else if (e.getSource() == coinButtons[3])
			currInput = "nickel";
		}
		
	}
