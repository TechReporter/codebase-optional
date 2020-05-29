package datastructure;

/**
 * @author 212720190
 * @date Jan 13, 2020
 */
public class StockBuySell {

	//max profit buy selling stocks with max 1 transaction.
	public static void main(String[] args) {

		int[] arr = {2,3,1,6,8,5};
		int maxProfit=Integer.MIN_VALUE;
		int buyPointer=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<buyPointer) {
				buyPointer = arr[i];
			}
			maxProfit = Math.max(maxProfit, arr[i]-buyPointer);
		}
		System.out.println(maxProfit);
	}

}
