/**
 * 
 */
package datastructure;

/**
 * @author 212720190
 * @date Jul 10, 2019
 */
public class StringAppendDelete {
	//is it possible to make s1 to s2 by exactly add/delete k times
	public static void main(String[] args) {

		String s1 = "hackerhappy";
		String s2 = "hackerrank";
		int k=9;
		int common_count = 0;
		for(int i=0;i<Math.min(s1.length(), s2.length());i++) {
			if(s1.charAt(i)==s2.charAt(i))
				common_count++;
		}

		if(s1.length()+s2.length()<k)
			System.out.println("YES");
		else if((s1.length()+s2.length()-2*common_count)>k)
			System.out.println("NO");
		else if((s1.length()+s2.length()-2*common_count)%2==k%2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
