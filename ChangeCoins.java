package lightfoot_OutLab4;
/*
 * Westin Lightfoot, Benjimin Naylor, Brenden Smith 
 * CSCI232
 * Program 4
 * 
 * Contains a single method, taking in two parameters(an array, int) and picks the least amount 
 * of coins to match the correct amount of cents. (US currency)   
 */
public class ChangeCoins {
	public static int[] change(int[] coins, int a) {
		if(coins.length == 0) { // if the array is empty
			throw new IllegalArgumentException("No Change Available");
		}
		int[] ans = new int[9];
		int need = a;
		int current = 0;
		while(need != 0) {
			for(int i = 0; i < coins.length; i++) { //loops through input array
				if(coins[i] <= need) {
					do {
						need -= coins[i];
						ans[current] = coins[i];
						current++;
					} while(coins[i] <= need);
					
				} else{
						
					}//end of else
			}//end of forLoop
		}//end of whileLoop
		return ans;
	}
}
