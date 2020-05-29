/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Dec 25, 2019
 */
public class CountProductWithinRange {

// given range, count prduct with range where x*(x+1)
	public static void main(String[] args) {
		int x=15;
		int y=30;
		int count=0;
		for(int i=2;i<((x>y)?x/2:y/2);i++) {
			if(i*(i+1)>=x && i*(i+1)<=y) {
				count++;
			}
		}
		System.out.println(count);

	}

}
