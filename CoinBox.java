package vendingMachine;

/**
 * @author tobyf
 *
 */
public class CoinBox {
 
	private int quarters;
	private int dimes;
	private int nickels;
  

  /**
 *  Constructor
 *  Sets quarters, dimes, and nickels to 0
 */
public CoinBox() {
	  quarters = 0;
	  dimes = 0;
	  nickels = 0;
  }
  

  /**
 *  Increments quarters
 */
public void addQuarter() {
	  quarters++;
  }

/**
*  Increments dimes
*/
  public void addDime() {
	  dimes++;
  }
  
  /**
   *  Increments nickels
   */
  public void addNickel() {
	  nickels++;
  }
  

// returns the current number of quarters
  /**
 * @return quarters
 */
public int getQuarters() {
	  return quarters;
  }
// returns the current number of dimes

  /**
 * @return dimes
 */
public int getDimes() {
	  return dimes;
  }

  /**
 * @return nickels
 */
public int getNickels() {
	  return nickels;
  }
   
  /**
 *  Decrements quarters
 */
public void removeQuarter() {
	  quarters -= 1;
  }
  

  /**
 *  Decrements dimes
 */
public void removeDime() {
	  dimes -= 1;
  }
  
  /**
 * Decrements nickels
 */
public void removeNickel() {
	  nickels -= 1;
  }
    
/**
 * Sets all coins to 0
 */
public void resetCoins() {
	nickels = 0;
	dimes = 0;
	quarters = 0;
}
  
  // transferCoins(CoinBox)
  // takes a CoinBox as input and sets this coinbox's coin values to that of 
  // the input CoinBox and sets the input coinbox's coin values to 0.

  /**
 * @param cb : coinbox to take coins from
 * Transfers all coins from cb to this
 */
public void transferCoins(CoinBox cb) {
	  this.quarters += cb.getQuarters();
	  this.dimes += cb.getDimes();
	  this.nickels += cb.getNickels();
	  cb.resetCoins();
	  
  }
}
