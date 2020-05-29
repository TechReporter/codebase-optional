/**
 * 
 */
package stringpractice;

/**
 * @author 212720190
 * @date Mar 23, 2020
 */
public class AddBinaryString {
	
	
	public static void main(String[] args) {
		String s1="11";
		String s2 ="11";
		int p1 = s1.length();
		int p2=s2.length();
		int flag=0;
		StringBuffer sb = new StringBuffer();
		while(p1>0 || p2>0) {
			int sum=0;
			int i=0,j=0;
			if(p1>0) {
			i=s1.charAt(p1-1)=='1'?1:0;
			}
			if(p2>0) {
			j=s2.charAt(p2-1)=='1'?1:0;
			}
			sum=i+j+flag;
			flag=sum/2;
			if(sum>=2) {
				sb.append(sum-2);
			} else {
				sb.append(sum);
			}
			p1--;
			p2--;
		}
		sb.append(flag);
		System.out.println(sb.reverse().toString());
	}

}
