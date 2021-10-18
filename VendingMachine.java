package vendingMachine;
public class VendingMachine {
	
  Stockpile[] stocks;
  BeverageReceiver bevReceiver;
  ChangeReceiver changeReceiver;
  BillBox billBox;
  CoinBox receiverCoinBox;
  CoinBox changeCoinBox;
  ChangeLight changeLight;
  Display display;
  
 
  
  // VendingMaching(Stockpile[]) -> void
  // VendingMachine constructor
  public VendingMachine(Stockpile[] stocks) {
	  this.stocks = stocks;
	  bevReceiver = new BeverageReceiver();
	  changeReceiver = new ChangeReceiver();
	  billBox = new BillBox();
	  receiverCoinBox = new CoinBox();
	  changeCoinBox = new CoinBox();
	  changeLight = new ChangeLight();
	  display = new Display();
	  
  }
  

 //getStockpiles() -> Stockpile[]
 // returns this stockpile array 
  public Stockpile[] getStockpiles() {
	  return this.stocks;
  }
  

 //getBillBox() -> BillBox
 // returns this billBox
  public BillBox getBillBox() {
	  return this.billBox;
  }
  

//getReceiverCoinBox() -> Coinbox
 // returns this receiverCoinBox
  public CoinBox getReceiverCoinBox() {
	  return this.receiverCoinBox;
  }
  

 //getchangeCoinBox() -> Coinbox
 // returns this changeCoinBox
  public CoinBox getchangeCoinBox() {
	  return this.changeCoinBox;
  }
    

  // getDisplay() -> Display
  // returns this display
  public Display getDisplay() {
	  return this.display;
  }
  


  // computeChange(int, int) -> int
  // Takes deposit and price as input and returns deposit if it is not enough money to pay for the soda
  // and returns deposit - price if deposit is enough to pay for the soda
  public int computeChange(int deposit, int price) {
	  if(deposit < price) {
		  System.out.println(changeLight.notEnough());
		  return deposit;
	  }
	  else {
		  return deposit - price;
	  }
  }
  
  // depositsToCents() -> int
  // returns the value of all change in billbox and recievercoinbox in cents.
  public int depositsToCents() {
	  int cents =  (billBox.getBills() * 100);
	  cents += (receiverCoinBox.getQuarters() * 25);
	  cents += (receiverCoinBox.getDimes() * 10);
	  cents += (receiverCoinBox.getNickels() * 5);
	  return cents;
  }

  // priceToCents(Stockpile) -> int
  // converts the price of a given stockpile to cents.
  public int priceToCents(Stockpile s) {
	  int cents =(int) (s.getPrice() * 100);
	  return cents;
  }
}
