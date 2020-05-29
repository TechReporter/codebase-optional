/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 25, 2020
 */
public class AddStrings {

	//415. Add Strings
	public static void main(String[] args) {
		String num1="101";
		String num2="990";
		int p1=num1.length()-1;
		int p2=num2.length()-1;
		int flag=0;
		StringBuilder sb = new StringBuilder();
		while(p1>=0 || p2>=0) {
			int i= p1>=0?num1.charAt(p1--)-'0':0;
			int j=p2>=0?num2.charAt(p2--)-'0':0;

			int sum=i+j+flag;
			sb.append(sum%10);
			flag=sum/10;
		}
		if(flag!=0) {
			sb.append(flag);
		}
		System.out.println(sb.reverse().toString());
	}

}
