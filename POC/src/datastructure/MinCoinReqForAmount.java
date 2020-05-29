/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date May 26, 2019
 */
public class MinCoinReqForAmount {

	
	public static void main(String[] args) {

		int[] coins = {1,2,3};
		int amount = 5;
		
		int[] reqCoin = new int[amount+1];
		reqCoin[0] = 0;
		
		
		for(int i = 1;i<=amount;i++) {
			reqCoin[i] = Integer.MAX_VALUE;
			for(int j=0;j<coins.length;j++) {
				 if (coins[j] <= i) { 
	                    reqCoin[i] = Math.min(reqCoin[i - coins[j]] + 1,reqCoin[i]) ;
	                }
			}
		}
		
		
	}

}
