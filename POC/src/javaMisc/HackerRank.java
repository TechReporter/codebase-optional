/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Dec 14, 2019
 */
public class HackerRank {

	public static void main(String[] args) {

		int[] a = {1};
		HackerRank obj = new HackerRank();
		obj.incr(a);
		System.out.println(a[a.length-1]);
	}
	
	void incr(int[] a) {
		a[a.length-1]++;
	}

}
