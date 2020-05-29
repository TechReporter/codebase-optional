/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class RobotReturnOrigin {

	//657. Robot Return to Origin
	public static void main(String[] args) {
		String str = "LL";
		int leftRight=0;
		int upDown=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='U') {
				upDown++;
			} else if(str.charAt(i)=='D')
				upDown--;
			else if(str.charAt(i)=='L')
				leftRight++;
			else
				leftRight--;
		}
		if(upDown!=0 || leftRight!=0)
			System.out.println("not same");

	}

}
