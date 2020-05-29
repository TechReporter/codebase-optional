/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 30, 2020
 */
public class CountHammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=hammingDistance(12);
		String t=hammingDistance(3);
		int count=0;
		int i=s.length()-1;
		int j=t.length()-1;
		while(i>=0 && j>=0) {
			if(s.charAt(i)!=t.charAt(j))
				count++;
			i--;
			j--;
		}
		int temp=i>j?i:j;
		String str=i>j?s:t;
		for(;temp>=0;temp--) {
			if(str.charAt(temp)=='1')
				count++;
		}
		System.out.println(count);
	}


	static String hammingDistance(int x) {
		StringBuilder res=new StringBuilder();
		while(x>0) {
			int rem=x%2;
			res=res.append(String.valueOf(rem));
			x/=2;
		}
		return res.reverse().toString();
	}

}
