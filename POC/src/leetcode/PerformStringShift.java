package leetcode;

/**
 * @author 212720190
 * @date Apr 14, 2020
 */
public class PerformStringShift {

	public static void main(String[] args) {
		String s = "abc";
		int[][] shift = {{0,2},{1,1}};
			int rightShift=0;
			int leftShift=0;
			boolean isRight = false;
			
			for(int i=0;i<shift.length;i++) {
				if(shift[i][0]==1)
					rightShift+=shift[i][1];
				else
					leftShift+=shift[i][1];
			}
		if(rightShift>leftShift) {
			isRight=true;
		}
		int i=0;
		if(isRight) {
			while(i<(rightShift-leftShift)) {
				s = s.charAt(s.length()-1)+s.substring(0, s.length()-1);
				i++;
			}
		} else {
			while(i<(leftShift-rightShift)) {
				s = s.substring(1,s.length())+s.charAt(0);
				i++;
			}
		}
	}
	
	//static rightShift(String)

}
