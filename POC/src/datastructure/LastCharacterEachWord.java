package datastructure;

/**
 * @author 212720190
 * @date Aug 17, 2019
 */
public class LastCharacterEachWord {

	public static void main(String[] args) {
		
		
		int arr[]= {1,1,2,2,4,4,5,5,5};
		

		int[] freqs = new int[101];
	    for (Integer i : arr) {
		    freqs[i]++;
	    }
	    int max = 0;
	    for (int i = 1; i < freqs.length-1; i++)
	    	max=Math.max(max, freqs[i] + freqs[i+1]);		
		
	    System.out.println(max);
		
		
		
/*		
		String s = "abcaab";
		long n=1000000000000L;

		long numOfS = n/s.length();
	    long rest = n % s.length();

	    if(!s.contains("a")) 
	    	System.out.println(0);
	    
	    System.out.println(s.length()>n? aCounter(s, rest) 
	            : numOfS*aCounter(s, s.length()) + aCounter(s, rest));
	    
	
		*/
		
		/*
		
		
		int[] arr = {3, 17, 12, 9, 11, 15};
		int K=5;
		 int f[] = new int[K]; 
	        Arrays.fill(f, 0); 
	   	     
	        for (int i = 0; i < arr.length; i++) 
	            f[arr[i] % K]++; 
	      
	        if (K % 2 == 0) 
	            f[K/2] = Math.min(f[K/2], 1); 
	      
	        int res = Math.min(f[0], 1); 
	      
	    
	        for (int i = 1; i <= K/2; i++) 
	            res += Math.max(f[i], f[K-i]); 
		
		System.out.println(res);
			
		
		

		String str = "tanmoy dasgupta";
		String[] str_arr = str.split(" ");
		
		for(String s : str_arr) {
			System.out.println(s.charAt(s.length()-1));
		}
		
		// without split
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.println(str.charAt(i-1));
			}
			else if(i==str.length()-1)
				System.out.println(str.charAt(i));
		}
	*/}

    private static long aCounter(String s, long end) {
        int a=0;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == 'a') a++;
        }
        return a;
}
}
