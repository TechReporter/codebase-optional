package treedatastructure;

/**
 * @author 212720190
 * @date May 24, 2019
 */
public class BalanceParenthesisMatcher {
	static int top = -1;
	static char arr[] = new char[10];

	static void push(char chr) {
		if(top == 99)
			System.out.println("overflow");
		else
			arr[++top] = chr;
	}

	static char pop() {
		char element = '\0';
		if(top==-1)
			System.out.println("underflow");

		else
			element = arr[top];
		top--;
		return element;
	}

	private static boolean isParenthesisMatch(char a1, char a2) {

		if((a1 =='(' && a2 ==')') || (a1 =='{' && a2 =='}') || (a1 =='[' && a2 ==']')) {
			return true;
		}
		return false;
	}
	
	 static boolean isEmpty()  
     { 
         return (top == -1) ? true : false; 
     }

	private static boolean balanceParenthesis(char[] chr) {
		boolean ismatch = false;
		for(int i=0;i<chr.length;i++) {
			if(chr[i]=='('|| chr[i]=='{'|| chr[i]=='[') {
				push(chr[i]);
			} else if(chr[i]==')'|| chr[i]=='}'|| chr[i]==']') {
				
				if(isEmpty()) 
               { 
					ismatch = false;
					break;
               }
				if(isParenthesisMatch(pop(),chr[i])) {
					ismatch = true;
				} else {
					ismatch=false;
					break;
				}
			}
		}
		return ismatch; 
	}

	public static void main(String[] args) {
		char exp[] = {'{','[','(',']',')','}'}; 
		System.out.println(balanceParenthesis(exp));
	}

}
