package systemdesign;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Apr 8, 2020
 */
public class ProductOfLastKNumber {
	//1352. Product of the Last K Numbers
	List<Integer> list = new ArrayList<>();

	public void add(int num) {
		list.add(num);
	}

	public int getProduct(int k) {
		int product=1;
		int i = list.size()-1;
		if(k>40000)
			return 0;
		else {
			for(;i>=list.size()-k;i--) {
				product*=list.get(i);
			}
		}

		return product;
	}
	public static void main(String[] args) {
		ProductOfLastKNumber obj = new ProductOfLastKNumber();
		obj.add(3);
		obj.add(0);
		obj.add(2);
		obj.add(5);
		obj.add(4);
		System.out.println(obj.getProduct(2));
		System.out.println(obj.getProduct(3));
		System.out.println(obj.getProduct(4));
		obj.add(8);
		System.out.println(obj.getProduct(2));
	}

}
