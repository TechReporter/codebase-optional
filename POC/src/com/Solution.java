/**
 * 
 */
package com;

/**
 * @author 212720190
 * @date Mar 23, 2019
 */
import java.util.Arrays; 

class Solution { 

	public static void main(String[] args) { 
		int n = 3;
		int k = 2;
		String[] arr =  {"aa1","bbb","ccc"};
		String password = "aa1";
		solve(n,k,arr,password);

	} 

	public static void solve(int n,int k, String arr[], String password){
		int bestTime = 0;
		int worstTime = 0;
		int failedtry = 1;
		bestTime = (Arrays.asList(arr).indexOf(password)+1)*1;
		for(int i=n-1; i>=0; i--) {
			if(arr[i] != password) {
					if(failedtry!=k) {
						worstTime += 1;
						failedtry++;
					}else {
						worstTime+=5+1;
						failedtry = 0;
					}
			}
			else {
				worstTime+=1;
				break;
			}
		}


		System.out.println(bestTime+","+worstTime);
	}

} 
