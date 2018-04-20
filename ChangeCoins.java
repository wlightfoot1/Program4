package lightfoot_OutLab4;

public class ChangeCoins {
	public static int[] change(int[] coins, int a) {
		if(coins.length == 0) {
			throw new IllegalArgumentException("No Change Available");
		}
		int[] ans = new int[9];
		int need = a;
		int current = 0;
		while(need != 0) {
			for(int i = 0; i < coins.length; i++) {
				if(coins[i] <= need) {
					do {
						need -= coins[i];
						ans[current] = coins[i];
						current++;
					} while(coins[i] <= need);
					
				}else {
						
					}
			}
		}
		return ans;
	}
}
