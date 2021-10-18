package vendingMachine;

public class BillBox {

	int bills;
	
	
	// BillBox() -> void
	// BillBox constructor
	public BillBox() {
		bills = 0;
	}
	
	
	// addBill() -> void
	// increments bills by 1
	public void addBill() {
		bills++;
	}
	public void addBills(int num) {
		bills += num;
	}
    
		
	// resetBills() -> void
	// sets bills to 0
	public void resetBills() {
		bills = 0;
	}
	
	// removeBill() -> void
	// decrements bills by 1
	public void removeBill() {
		bills--;
	}
	

	// getBills() -> int
	// returns the bills data field
	public int getBills() {
		return bills;
	}
	
}
