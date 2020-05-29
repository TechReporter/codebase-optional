/**
 * 
 */
package datastructure;

/**
 * @author Tanmoy Dasgupta
 * @date Dec 15, 2019
 */
public class ClosestNonEmptyString {

	public static void main(String[] args) {

		String[] str = {"mani","tanmoy","","","","","test"};
		int mid = (0+str.length-1)/2;
		if(str[mid].isEmpty()) {
			int left=mid-1;
			int right = mid+1;

			while(true) {
				if(left<0 && right>str.length-1)
					break;
				if(left>=0 && !str[left].isEmpty()) {
					System.out.println(str[left]+" "+left);
					break;
				}
				if(right<=str.length-1 && !str[right].isEmpty()) {
					System.out.println(str[right]+" "+right);
					break;
				}
				right++;
				left--;
			}
		}
	}

}
