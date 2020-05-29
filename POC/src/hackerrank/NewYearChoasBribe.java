/**
 * 
 */
package hackerrank;

/**
 * @author 212720190
 * @date Mar 28, 2020
 */
public class NewYearChoasBribe {

/*	It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! 
	There are a number of people queued up, and each 
	person wears a sticker indicating their initial position in the queue. 
	Initial positions increment by  from  at the front of the line to  at the back.

	Any person in the queue can bribe the 
	person directly in front of them to swap positions. 
	If two people swap positions, they still wear the same sticker 
	denoting their original places in line. One person can bribe at most two others.
	For example, if  and  
	bribes , the queue will look like this: .
	Fascinated by this chaotic queue, you decide you must know the minimum number of
	bribes that took place to get the queue into its current state!*/
	public static void main(String[] args) {
		int[] arr = {1,2,5,3,7,8,6,4};
		
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(Math.abs(i+1-arr[i])>2) {
				System.out.println("too chaotic");
				break;
			}
			count+=Math.abs(i+1-arr[i]);
		}
		System.out.println(count);

	}

}
