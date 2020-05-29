package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Dec 28, 2019
 */
public class CommonCharacterInAllString {

	//find all common character in string array
	
	static int[] test(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		List<Integer> list = new ArrayList<>();
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
				if(a[i]==b[j]) {
					list.add(a[i]);
					i++;
					j++;
			} else if(a[i]<b[j]) {
				i++;
			} else {
				j++;
			}
		}
		
		int[] aa = new int[list.size()];
		for(int m=0;m<list.size();m++) {
			aa[m]=Integer.parseInt(String.valueOf(list.get(m)));
		}
		return aa;
	}
	
	
	public static void main(String[] args) {
		
		int[] nums1 = {3,1,2};
		int[] nums2 = {1,1};
		
		System.out.println(Arrays.toString(test(nums1,nums2)));
		if(nums2.length<nums1.length) {
			int[] c = Arrays.stream(nums2).filter(e->Arrays.stream(nums1).anyMatch(ee->ee==e))
					.toArray();
			System.out.println(Arrays.toString(c));

		} else {
			int[] d = Arrays.stream(nums1).filter(e->Arrays.stream(nums2).anyMatch(ee->ee==e))
					.toArray();
			System.out.println(Arrays.toString(d));

		}
		

		
	
		
		
		/*

		String[] A = {"cool","lock","cook"};
		int[] arr = new int[26];
		Arrays.fill(arr, Integer.MAX_VALUE);

		List<String> ss = new ArrayList<>();
		for(String str : A) {
			int[] current = new int[26];
			for(Character chr : str.toCharArray()) {
				current[chr-'a']++;
			}
			for(int i=0;i<26;i++) {
				arr[i] = Math.min(arr[i], current[i]);
			}
		}

		for(int k=0;k<26;k++) {

			int n = arr[k];
			while(n>0) {
				ss.add(String.valueOf((char)(k+97)));
				n--;
			}
		}
		ss.forEach(System.out::println);
	*/}
}

