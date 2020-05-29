/**
 * 
 */
package hackerrank;

/**
 * @author 212720190
 * @date Mar 12, 2020
 */
public class HalloweenSale {

	
	public static void main(String[] args) {
		int basePrice = 20;
		int total = 85;
		int diff = 3,min =6;
		int sum = 0;
		int count=-1;
		while(basePrice>=min && sum<=total) {
			sum+=basePrice;
			count++;
			if(basePrice-diff>min)
			basePrice-=diff;
			else {
				basePrice=min;
			}
		}
	
		System.out.println(count);

	}

}
