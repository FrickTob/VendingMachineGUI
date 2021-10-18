package vendingMachine;

public class Stockpile {
	
	int count;
	double price;
	int id;
	
	
    
	// Stockpile(int, price, id) -> void
	// Constructor for Stockpile
	public Stockpile(int count, double price, int id) {
		this.count = count;
		this.price = price;
		this.id = id;
	}
	
	// removeSoda() -> void
	// decrements count by 1
	public void removeSoda() {
		count--;
	}
	

	// isEmpty() -> boolean
	// returns true if Stockpile is empty and false otherwise
	public boolean isEmpty() {
		if(count <= 0)
			return true;
		return false;
	}
	
	// getPrice() -> double
	// returns price
	public double getPrice() {
		return price;
	}
	
	// getID() -> int
	// returns id
	public int getId() {
		return id;
	}
}
