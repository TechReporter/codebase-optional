/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Feb 1, 2020
 */
public class Index1 {

	{
		count = 1;
	}
	static int count =3;
	
	public Index1(int c) {
		super();
		this.count = c;
	}
	
	void test () {
		int[][] arr = {{1,2,3,4,9},{4,2,77,4,2},{12,43,55,7,10},{4,3,11,23,34,56},{99,54,22,11,2}};
		System.out.println(arr[count++][++count]);
	}
	public static void main(String[] args) {

		new Index1(count).test();
	}

}
