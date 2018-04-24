package lightfoot_OutLab4;

/*
 * Westin Lightfoot, Benjamin Naylor, Brendan Smith 
 * CSCI_232
 * Program 4
 * 
 * Contains a single method, taking in two parameters(an array, int) and picks the least amount 
 * of coins to match the correct amount of cents. (US currency)   
 */

public class ChangeCoins {
	public static int[] change(int[] coins, int amount) {
		int[] ans = new int[amount + 1];	//holds the minimun amount of coins needs
		int[] holder = new int[amount + 1]; //holds a copy of the coins array
		holder[0] = 0;
		int count = 0;
        int holderTwo[] = new int[amount + 1];
        int last = ans.length - 1;
        
		if(coins.length == 0) { // if the coins array is empty
			throw new IllegalArgumentException("No Change Available");
		}//if
		for(int a = 1; a <= amount; a++) {	//fills both array with temporary values
			holder[a] = 500;
			ans[a] = 0;
		}//for
		for(int b = 0; b < coins.length; b++) {	//loops through coins 
			for(int c = 1; c <= amount; c++) {
				if(c >= coins[b]) {
					if(holder[c - coins[b]] + 1 < holder[c]) { //picks correct coins
						holder[c] = 1 + holder[c - coins[b]];
						ans[c] = b;
					}//if
				}//if
			}//for
		}//for
        while (last != 0) { //loop through array
            int pointer = ans[last];                        
            holderTwo[count] = coins[pointer];
            last -= coins[pointer];//next last
            count++;  
        }//while
        int finalChange[] = new int [count];
        for(int i = 0; i < count; i++){ //tranfer to new array
            finalChange[i] = holderTwo[i];
        }//for
        return finalChange;
    }//change
}
