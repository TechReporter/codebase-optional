package matrixPrlbs;

/**
 * @author 212720190
 * @date Jun 14, 2019
 */
public class SaerchElementSortedMatrix {


	public static void main(String[] args) {
	    int mat[][] = { { 10, 20, 30, 40 }, 
                { 15, 25, 35, 45 }, 
                { 27, 29, 37, 48 }, 
                { 32, 33, 39, 50 } }; 
	    
	    int elem = 25;
	    
	    int i=0,j=mat.length-1;
	    
	    while(i>=0 &&j<mat.length) {
	    	
	    	if(mat[i][j]==elem) {
	    		System.out.println("found "+i+","+j);
	    		return;
	    	}
	    	if(mat[i][j] >elem)
	    		j--;
	    	else
	    		i++;
	    }
	    
	    
	}

}
