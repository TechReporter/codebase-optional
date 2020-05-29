/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class PrintAllPrime {

	//count all prime number less than n
	public static void main(String[] args) {
		int n=10;
		int count=0;
		boolean[] isPrime = new boolean[n];
		for(int i=2;i*i<n;i++) {
			if(!isPrime[i]) {
				for(int j=i;j*i<n;j++) {
					isPrime[i*j]=true;
				}
			}
		}
		for(int i=2;i<n;i++) {
			if(!isPrime[i])
				count++;
		}
		System.out.println(count);
	}

}
