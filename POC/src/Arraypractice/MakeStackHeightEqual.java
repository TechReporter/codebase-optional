/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 8, 2020
 */
public class MakeStackHeightEqual {

	
	public static void main(String[] args) {
		int[] h1 = {3,2,1,1,1};
		int[] h2 = {4,3,2};
		int[] h3 = {1,1,4,1};
		int total1=0,total2=0,total3=0;
		for(int i=0;i<h1.length;i++) {
			total1+=h1[i];
		}
		for(int i=0;i<h2.length;i++) {
			total2+=h2[i];
		}
		for(int i=0;i<h3.length;i++) {
			total3+=h3[i];
		}
		if(total1==total2 || total2==total3)
			System.out.println(total1);
		int i=0,j=0,k=0;
		while(total1>0 || total2>0 || total3>0) {
			if(total1==total2 && total2==total3) {
				System.out.println(total1);
				break;
			} if(total1>total2 && total1>total3) {
				total1-=h1[i];
				i++;
			} else if(total2>total1 && total2>total3) {
				total2-=h2[j];
				j++;
			} else {
				total3-=h3[k];
				k++;
			}
						
		}

	}

}
