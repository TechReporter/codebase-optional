
package datastructure;

import java.math.BigInteger;

public class FibonacciSeries {

	static int i =0,j=1,l=0;
	public static void main(String[] args) {
		System.out.println(i+" "+j);
		//fibbonacciWithoutRecursion();
		//fibbonacciWithRecursion(6);
		
		//System.out.println(nthValFibSeries(9));
		//System.out.println(nthValFibSeriesNonRepeat(9));
		System.out.println(nthValFibSeriesNonRepeat_new(0,1,10));
		System.out.println(nthValFibSeriesNonRepeat_new(10));


	}
	
	static void fibbonacciWithoutRecursion() {
		int val1 = 0,val2 = 1;
		
		System.out.println(val1+","+val2);
		for(int i=0;i<7;i++) {
			int val3 = val1+val2;
			System.out.println(val3);
			val1=val2;
			val2 = val3;
		}
	
	}
	
	static void fibbonacciWithRecursion(int count) {
		if(count>0) {
			l=i+j;
			i=j;
			j=l;
			System.out.println(" "+l);
			fibbonacciWithRecursion(count-1);
		}
	}
	
	static int nthValFibSeries(int n) {
		if(n<=1)
			return n;
		return nthValFibSeries(n-1)+nthValFibSeries(n-2);
	}
	
	//reduce repeated func call
	static int nthValFibSeriesNonRepeat(int n) {
		
		int[] arr = new int[n+2];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2;i<=n;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	
	//reduce repeated func call
	//t3=t1+(t2*t2) sequence
	static BigInteger nthValFibSeriesNonRepeat_new(int i, int j, int n) {
		
		BigInteger t1 =new BigInteger(String.valueOf(i));
		BigInteger t2 =new BigInteger(String.valueOf(j));
		BigInteger t3 =new BigInteger("0");
		
	        while(n-2>0){
	            t3=t1.add(t2.multiply(t2));
	            t1=t2;
	            t2=t3;
	            n--;
	        }
	        return t2;
	}
	
	static int nthValFibSeriesNonRepeat_new(int n) {
		
		int t1 = 0,t2=1,t3=0;
		
	        while(n-2>0){
	            t3=t1+t2;
	            t1=t2;
	            t2=t3;
	            n--;
	        }
	        return t2;
	}
	
	
}
