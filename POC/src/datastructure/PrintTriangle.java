package datastructure;

/**
 * @author 212720190
 * @date May 18, 2019
 */
public class PrintTriangle {
	
	public static void main(String[] args) {
		int row = 6;

		for(int i =1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");      
			}
            System.out.println(); 
		}
	}
}
