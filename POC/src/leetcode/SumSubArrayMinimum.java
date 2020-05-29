/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author 212720190
 * @date Apr 11, 2020
 */
public class SumSubArrayMinimum {

	//907. Sum of Subarray Minimums
	public static void main(String[] args) {
		//Given an array of integers A, find the sum of min(B), 
		//where B ranges over every (contiguous) subarray of A.
		int[] arr = {3,1,2,4};
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<=arr.length;j++) {
				PriorityQueue<Integer> pq = new PriorityQueue<>();
				for(int k=i;k<j;k++) {
					pq.add(arr[k]);
				}
				List<Integer> list = new ArrayList<>();
				while(!pq.isEmpty())
					list.add(pq.remove());
				if(list.size()>0)
				res.add(list);
			}
		}
		int sum=0;
		for(List<Integer> s : res) {
			sum+=s.get(0);
		}
		System.out.println((sum%1000000007 + 1000000007) % 1000000007);
	}
	
	//another way
	 public int sumSubarrayMins(int[] A) {
	        int resultSum=0;
	        int mod = (int)1e9 + 7;
	        
	        int[] lesserOnLeft = new int[A.length];
	        int[] lesserOnRight = new int[A.length];
	        Arrays.fill(lesserOnRight, -1);
	        
	        Stack<Integer> s = new Stack<>();
	        for (int i=0;i<A.length;i++) {
	            while(!s.isEmpty() && A[s.peek()] >= A[i]) {
	                int top = s.pop();
	                lesserOnRight[top] = i;
	            }
	            lesserOnLeft[i] = (s.isEmpty()) ? -1 : s.peek();
	            s.push(i);
	        }
	        
	        for (int i=0;i<A.length;i++) {
	            int countFromLeft = (lesserOnLeft[i] == -1) ? i+1 : i - lesserOnLeft[i];
	            int countFromRight = (lesserOnRight[i] == -1) ? A.length-i : lesserOnRight[i] - i;
	            int iAsMinimumIn = A[i]*countFromLeft*countFromRight;
	            resultSum = (resultSum + iAsMinimumIn ) % mod;
	        }
	        return resultSum;
	    }

}
