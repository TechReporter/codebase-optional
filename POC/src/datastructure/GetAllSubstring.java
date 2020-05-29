package datastructure;

/**
 * @author 212720190
 * @date Aug 17, 2019
 */
public class GetAllSubstring {


	public static void main(String[] args) {

		String str = "tanmoy";
		
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
		System.out.println("===============");
		//alternate approach
		
		for(int i=0;i<=str.length();i++) {
			for(int j=0;j<=str.length()-i;j++) {
			
				for(int k=i;k<=i+j-1;k++) {
					System.out.print(str.toCharArray()[k]);
				}
				System.out.println();
			
				
				
			}
			
		}
		
	}

}
