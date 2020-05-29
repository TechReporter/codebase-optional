/**
 * 
 */
package stackProblm;

/**
 * @author 212720190
 * @date Jun 8, 2019
 */
public class TwoStackUsingOneArray {

	int size;
	int[] arr;
	int top1;
	int top2;
	public TwoStackUsingOneArray(int n) {
		this.size = n;
		this.arr = new int[n];
		this.top1=-1;
		this.top2 = n;
	}

	void push1(int data) {
		if(top1==top2-1) {
			System.out.println("stack1 overflow");
			System.exit(-1);	
		}
		top1++;
		arr[top1] = data;
	}
	
	void push2(int data) {
		if(top1==top2-1) {
			System.out.println("stack2 overflow");
			System.exit(-1);	
		}
		top2--;
		arr[top2] = data;
	}
	
	void pop1() {
		if(top1==-1) {
			System.out.println("no element in stack1");
			System.exit(-1);
		}
			int data = arr[top1];
			top1--;
			System.out.println("data picked from stack1 "+data);
	} 
	
	void pop2() {
		if(top2==size) {
			System.out.println("no element in stack2");
			System.exit(-1);
		}
			int data = arr[top2];
			top2++;
			System.out.println("data picked from stack2 "+data);
	}

	public static void main(String[] args) {

		TwoStackUsingOneArray obj = new TwoStackUsingOneArray(10);
		obj.push1(4);
		obj.push1(88);
		obj.push2(54);
		obj.pop1();
		obj.push2(12);
		obj.push2(8);
		obj.pop1();
		obj.pop2();
		obj.pop1();
		obj.push1(5);
		obj.push2(35);
		obj.push1(44);
		obj.push2(1);

	}

}
