/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jul 6, 2019
 */

//a[i]-a[i-1]=1 and should not start with 0
public class StringSeperation {

	public static void main(String[] args) {

		String s = "99100";
		long num = 0;
		boolean mark = false;    

		char[] arr = s.toCharArray();

		for(int i=1;i<=arr.length/2;i++){
			String first = s.substring(0,i);
			long temp = Long.parseLong(first);
			num = temp;

			String k = Long.toString(num);
			while (k.length() < s.length()) {
				k += Long.toString(++temp);
			}

			if (k.equals(s)) {
				mark = true;
				break;
			}
		}

		if(mark == true)
			System.out.println("YES "+num);
		else
			System.out.println("NO");    
	}

}
