
package vendingMachine;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;




public class VendingMachineTester {
	public static void main(String[] args) throws InterruptedException {
		
		VendingScreen screen = new VendingScreen();
		int numStockpiles;
		
	  // Set size of array from user input
       screen.changeText("Enter the number of soda types: ");
       screen.toggleSeekingInput();
       while(screen.getSeekingInput()) {
    	   System.out.println(screen.getInput());
       }
       numStockpiles = Integer.parseInt(screen.getInput()); 
       screen.resetInput();
       
	   Stockpile[ ] stockpileArray = new Stockpile[numStockpiles];        
		
	   
	   // Fill stockpileArray with stockpiles containing number, price and id from user input
	   int numberOfSoda;
	   double priceOfSoda;
	   int sodaID;
	   for(int i = 0; i < numStockpiles; i++) {
		   
		   screen.changeText("Enter the number of sodas");
		   screen.toggleSeekingInput();
		   screen.resetInput();
		   while(screen.getSeekingInput()) {
			   System.out.println(screen.getInput());
		   }
		   numberOfSoda = Integer.parseInt(screen.getInput()); 
		   screen.resetInput();

		   screen.changeText("Enter the price");
		   screen.toggleSeekingInput();
		   while(screen.getSeekingInput()) {
			   System.out.println(screen.getInput());
		   }
		   priceOfSoda = Double.parseDouble(screen.getInput()); 
		   screen.resetInput();

		   screen.changeText("Enter the ID");
		   screen.toggleSeekingInput();
		   while(screen.getSeekingInput()) {
			   System.out.println(screen.getInput());
		   }
		   sodaID = Integer.parseInt(screen.getInput()); 
		   screen.resetInput();

		   Stockpile sp = new Stockpile(numberOfSoda, priceOfSoda, sodaID);
		   stockpileArray[i] = sp;
	   }

		
	   // Create a vending machine containing the stockpileArray that we created and filled above
	   VendingMachine vm = new VendingMachine(stockpileArray);
	   System.out.println();
            		
	   while(true) {
          
		 // Check if user wants to buy a soda. If yes, get ID of the desired soda from user input
           System.out.println("Enter the ID of stockpile: ");
           screen.changeText("Enter the ID of Stockpile: ");
           screen.toggleSeekingInput();
           while(screen.getSeekingInput()) {
        	   System.out.println(screen.getInput());
           }
           int userID = Integer.parseInt(screen.getInput());
           
           
          // Compare id given from user input to the id of all sodas in the stockPile Array. 
          // If we find a match, use that stockpile for the rest of the calculations below.
          // If a match is not found, ask user to enter a valid ID and try again.
           Stockpile sp = null;
           do {
	           for(Stockpile stockpile : stockpileArray) {
	        	   if(stockpile.id == userID)
	        		   sp = stockpile;
	           }
	           if(sp == null) {
	        	   System.out.println("Invalid ID. Please try again.");
	        	   screen.resetInput();
	        	   TimeUnit.MILLISECONDS.sleep(250);
	        	   screen.changeText("Enter the ID of stockpile: ");
	        	   screen.toggleSeekingInput();
	               while(screen.getSeekingInput()) {
	            	   System.out.println(screen.getInput());
	               }
	               userID = Integer.parseInt(screen.getInput());
	           }
           }
           while(sp == null);
                                 
           
           // Check if there is a soda in the selected stockpile.
           // If there isnt't tell the user.
           // If there is, ask for money until deposits is greater than or equal to price.
           // Make change if possible and vend.
           if(sp.isEmpty()) {
        	   System.out.println(vm.getDisplay().soldOut());
        	   System.out.println("\n");
           }
           else {
        	   int currDeposit = 0;
           	   int currPrice = vm.priceToCents(sp);
           	   screen.changeText("Insert Change");
        	while(currDeposit < currPrice ) {  
        		     
        		if(screen.getInput() != "") {
              
              if(screen.getInput() == "bill") {
            	  vm.billBox.addBill();
              }
              if(screen.getInput() == "quarter") {
            	  vm.receiverCoinBox.addQuarter();
              }
              if(screen.getInput() == "dime") {
            	  vm.receiverCoinBox.addDime();
              }
              if(screen.getInput() == "nickel") {
            	  vm.receiverCoinBox.addNickel();
              }
              
              currDeposit = vm.depositsToCents();
              screen.resetInput();
        		}
        		System.out.println(screen.getInput()); 
              
           }
        	System.out.println();
        	vm.changeCoinBox.transferCoins(vm.getReceiverCoinBox());
        	vm.billBox.resetBills();
        	
           if(currDeposit > currPrice) {
        	   int change = currDeposit - currPrice;
        	   int q = 0; // q, d, and n represent the amount of change available to return to the user
        	   int d = 0;
        	   int n = 0;
        	   while (vm.changeCoinBox.getQuarters() > 0 && change / 25 > 0) {
        		   vm.changeCoinBox.removeQuarter();
        		   q += 1;
        		   change -= 25;
        	   }
        	   while (vm.changeCoinBox.getDimes() > 0 && change / 10 > 0) {
        		   vm.changeCoinBox.removeDime();
        		   d += 1;
        		   change -= 10;
        	   }
        	   while (vm.changeCoinBox.getNickels() > 0 && change / 5 > 0) {
        		   vm.changeCoinBox.removeNickel();
        		   n += 1;
        		   change -= 5;
        	   }
        	   
        	   if(change > 0) {
        		   System.out.println(vm.changeLight.notEnough());
        	   }
        	   if(q > 0) {
        		   if(q == 1)
        			   System.out.println("Take " + q + " quarter from the change receiver.");
        		   else
        			   System.out.println("Take " + q + " quarters from the change receiver");
        	   }
        	   if(d > 0) {
        		   if(d == 1)
        			   System.out.println("Take " + d + " dime from the change receiver.");
        		   else
        			   System.out.println("Take " + d + " dimes from the change receiver");
        	   }
        	   if(n > 0) {
        		   if(n == 1)
        			   System.out.println("Take " + n + " nickel from the change receiver.");
        		   else
        			   System.out.println("Take " + n + " nickels from the change receiver");
        	   }  
           }
        	
        	screen.changeText(vm.display.vend());
        	TimeUnit.MILLISECONDS.sleep(500);
        	screen.changeText(vm.bevReceiver.getSoda());
        	sp.removeSoda();
        	TimeUnit.SECONDS.sleep(1);
           }	
          }
        }
   }
