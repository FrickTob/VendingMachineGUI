package vendingMachine;

/**
 * @author tobyf
 *
 */
public class BillBox {

	int bills;
	
	/**
	 *  Constructor that sets bills to 0
	 */
	public BillBox() {
		bills = 0;
	}
	
	/**
	 *  increments bills
	 */
	public void addBill() {
		bills++;
	}

	/**
	 *  sets bills to 0
	 */
	public void resetBills() {
		bills = 0;
	}
	
	/**
	 *  decrements bills
	 */
	public void removeBill() {
		bills--;
	}
	
	/**
	 * @return current number of bills in BillBox
	 */
	public int getBills() {
		return bills;
	}
	
}
