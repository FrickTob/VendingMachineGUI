package vendingMachine;

public class Display {
		
	// soldOut() -> String
	// returns a message that the stockpile has no soda left
	public String soldOut() {
		return "Stockpile has run out of soda.";
	}
		

	// vend() -> String
	// returns a message that soda was purchased
	public String vend() {
		return "Soda is purchased successfully.";
	}
}
