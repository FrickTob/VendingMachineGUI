

package vendingMachine;


public class Stockpile {
	
	int count;
	double price;
	int id;
	
	
    
	/**
	 * @param count : This is the number of sodas of a this type
	 * @param price : This is the price of this type of soda
	 * @param id : This is the id of this type of soda
	 */
	public Stockpile(int count, double price, int id) {
		this.count = count;
		this.price = price;
		this.id = id;
	}
	
	/**
	 *  Removes one soda from this stockpile
	 */
	public void removeSoda() {
		count--;
	}
	
	/**
	 * @return returns true if there are no sodas left and false otherwise
	 */
	public boolean isEmpty() {
		if(count <= 0)
			return true;
		return false;
	}
	
	/**
	 * @return returns price of the soda
	 */
	public double getPrice() {
		return price;
	}
	
	
	/**
	 * @return returns id of the soda
	 */
	public int getId() {
		return id;
	}
}
