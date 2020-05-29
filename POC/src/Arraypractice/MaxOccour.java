/**
 * 
 */
package Arraypractice;

/**
 * @author 212720190
 * @date Mar 10, 2020
 */
public class MaxOccour {


	public static void main(String[] args) {
		String text = "UyyFh7H4OW2fZVsDDxuuoh1HuALNlLyxj8Vv7ui3Vgsdig6Qq5b6oqOwGLB0ceEUlYiBQd42XBp5886xywJCJIQPvyOpxeyK7p03Kjnpz5oKWDe8uSBpetMs3TeePfhlJywiKANFjPSb87MsWoAQclfULYubZY20zsyVxZx9zZn7m3BmNgxZGsWFg9AJPRzOpLZI0niI";
		int[] chr = new int[256];
        for(int i=0;i<text.length();i++){
            chr[text.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        char res = ' ';
        for (int i = 0; i < text.length(); i++) { 
            if (max < chr[text.charAt(i)]) { 
                max = chr[text.charAt(i)]; 
                res = text.charAt(i); 
            } 
        }
        System.out.println(res+" max occour "+max);
	}

}
