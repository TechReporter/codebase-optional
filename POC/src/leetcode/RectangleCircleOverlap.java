/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Apr 5, 2020
 */
public class RectangleCircleOverlap {


	public static void main(String[] args) {
		System.out.println(checkOverlap(1,1,1,1,-3,2,-1));

	}

	public static boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
		int x_rad = x_center+radius;
		int y_rad = y_center+radius;

		if(x_rad>=x1)
			return true;
		else if(x_rad>=x2)
			return true;
		else if(y_rad>=y1)
			return false;
		else if(y_rad>=y2)
			return true;
		return false;

	}

}
