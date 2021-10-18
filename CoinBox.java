package vendingMachine;

public class CoinBox {
 
	private int quarters;
	private int dimes;
	private int nickels;
  

  public CoinBox() {
	  quarters = 0;
	  dimes = 0;
	  nickels = 0;
  }
  
// increments quarters by 1
  public void addQuarter() {
	  quarters++;
  }
// increments dimes by 1
  public void addDime() {
	  dimes++;
  }
// increments nickels by 1
  public void addNickel() {
	  nickels++;
  }
// increments quarters by num
  public void addQuarter(int num) {
	  quarters += num;
  }
// increments dimes by num
  public void addDime(int num) {
	  dimes += num;
  }
// increments nickels by num
  public void addNickel(int num) {
	  nickels += num;
  }
    
// returns the current number of quarters
  public int getQuarters() {
	  return quarters;
  }
// returns the current number of dimes
  public int getDimes() {
	  return dimes;
  }
// returns the current number of nickels
  public int getNickels() {
	  return nickels;
  }
  
// removes one quarter 
  public void removeQuarter() {
	  quarters -= 1;
  }
  
 //removes one dime 
  public void removeDime() {
	  dimes -= 1;
  }
  
 // removes one nickel 
  public void removeNickel() {
	  nickels -= 1;
  }
    

// sets the number of quarters to num
  public void setQuarters(int num) {
	  quarters = num;
  }
//sets the number of dimes to num
  public void setDimes(int num) {
	  dimes = num;
 }
//sets the number of nickels to num
  public void setNickels(int num) {
	  nickels = num;
}

  
  // transferCoins(CoinBox)
  // takes a CoinBox as input and sets this coinbox's coin values to that of 
  // the input CoinBox and sets the input coinbox's coin values to 0.
  public void transferCoins(CoinBox cb) {
	  this.quarters += cb.getQuarters();
	  this.dimes += cb.getDimes();
	  this.nickels += cb.getNickels();
	  cb.setQuarters(0);
	  cb.setDimes(0);
	  cb.setNickels(0);
	  
  }
}
