/**
 * 
 */
package datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Apr 30, 2019
 */
public class FindSymmetricPair {
	private int x;
	private int y;

	public FindSymmetricPair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

		FindSymmetricPair[] pair = {new FindSymmetricPair(2, 5),new FindSymmetricPair(3, 7)
				,new FindSymmetricPair(5, 2),new FindSymmetricPair(7, 1),new FindSymmetricPair(1, 6)
				,new FindSymmetricPair(7, 3)};

		Set<String> setData = new HashSet<>();

		for(FindSymmetricPair data : pair) {
			String str = "{"+data.x+","+data.y+"}";
			setData.add(str);
			String rev_str = "{"+data.y+","+data.x+"}";

			if(setData.contains(rev_str)) {
				System.out.println(str +" "+rev_str);
			}
		}

	}
}
