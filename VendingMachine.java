package vendingMachine;

/**
 * @author tobyf
 *
 */
public class VendingMachine {
	
  private Stockpile[] stocks;
  private BeverageReceiver bevReceiver;
  private BillBox billBox;
  private CoinBox receiverCoinBox;
  private CoinBox changeCoinBox;
  private ChangeLight changeLight;
  private Display display;
  
 
  /**
 * @param stocks : array of Stockpiles
 * Constructor 
 * makes a vending machine using stocks
 */
public VendingMachine(Stockpile[] stocks) {
	  this.stocks = stocks;
	  bevReceiver = new BeverageReceiver();
	  billBox = new BillBox();
	  receiverCoinBox = new CoinBox();
	  changeCoinBox = new CoinBox();
	  changeLight = new ChangeLight();
	  display = new Display();
	  
  }
   
  /**
 * @return this machine's Stockpile array
 */
public Stockpile[] getStockpiles() {
	  return this.stocks;
  }
  

  /**
 * @return this machine's billbox
 */
public BillBox getBillBox() {
	  return this.billBox;
  }
  


  /**
 * @return this machine's receiverCoinBox
 */
public CoinBox getReceiverCoinBox() {
	  return this.receiverCoinBox;
  }
  


  /**
 * @return this machine's changeCoinBox
 */
public CoinBox getchangeCoinBox() {
	  return this.changeCoinBox;
  }
    

  /**
 * @return this machine's display
 */
public Display getDisplay() {
	  return this.display;
  }
  
/**
 * @return this machine's bevReceiver
 */
public BeverageReceiver getbevReceiver() {
	return this.bevReceiver;
}
	
/**
 * @return this machine's changeLight
 */
public ChangeLight getChangeLight() {
	return this.changeLight;
}

  /**
 * @param deposit : amount of money deposited
 * @param price : price of soda
 * @return correct change
 */
public int computeChange(int deposit, int price) {
	  if(deposit < price) {
		  System.out.println(changeLight.notEnough());
		  return deposit;
	  }
	  else {
		  return deposit - price;
	  }
  }
  
  /**
 * @return total deposits in cents
 */
public int depositsToCents() {
	  int cents =  (billBox.getBills() * 100);
	  cents += (receiverCoinBox.getQuarters() * 25);
	  cents += (receiverCoinBox.getDimes() * 10);
	  cents += (receiverCoinBox.getNickels() * 5);
	  return cents;
  }

  /**
 * @param s : type of soda in machine
 * @return : cost of soda in cents
 */
public int priceToCents(Stockpile s) {
	  int cents =(int) (s.getPrice() * 100);
	  return cents;
  }


}
