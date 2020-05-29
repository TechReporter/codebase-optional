/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 212720190
 * @date Mar 8, 2020
 */
public class SignalFreqClassifictn {

	
	public static void main(String[] args) {
		List<Integer> freq_stnd = Arrays.asList(7,1,12,9,15);
		List<Integer> freq_signals = Arrays.asList(2,9,2000,13,4);
			int[] list = new int[freq_signals.size()];
			int k=0;
			for(int i=0;i<freq_signals.size();i++) {
				int min = Integer.MAX_VALUE;
				for(int j=0;j<freq_stnd.size();j++) {
					if(min>Math.abs(freq_signals.get(i)-freq_stnd.get(j))) {
						min = Math.abs(freq_signals.get(i)-freq_stnd.get(j));
						list[k]= j+1;
					}
				}
				k++;
			}
			List<Integer> list1 = Arrays.stream(list).boxed().collect(Collectors.toList());
			list1.forEach(System.out::print);
	}

}
