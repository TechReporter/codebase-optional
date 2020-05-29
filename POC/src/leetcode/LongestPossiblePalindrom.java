/**
 * 
 */
package leetcode;

/**
 * @author 212720190
 * @date Mar 29, 2020
 */
public class LongestPossiblePalindrom {

	//409. Longest Palindrome
	/*Given a string which consists of lowercase or uppercase letters, 
	 * find the length of the longest palindromes that can be built with those letters.

	This is case sensitive, for example "Aa" is not considered a palindrome here.
	Input:
		"abccccdd"
		Output:
		7
		Explanation:
		One longest palindrome that can be built is "dccaccd", whose length is 7.*/
	public static void main(String[] args) {
		String ss= "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewb" + 
				"irthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		int[] arr = new int[55];
		int palindromCount=0;
		boolean count=false;
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)>=97 && ss.charAt(i)<=122)
				arr[ss.charAt(i)-'a']++;
			else 
				arr[ss.charAt(i)-'A'+26]++;
		}
		
		for(int i = 0;i < arr.length;i++){
            if(arr[i] % 2 == 1) count=true;
            palindromCount += (arr[i] / 2) * 2;
        }
		if(count)
		System.out.println(palindromCount+1);
		else
			System.out.println(palindromCount);

	}

}
