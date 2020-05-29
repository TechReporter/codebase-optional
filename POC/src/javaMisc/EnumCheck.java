/**
 * 
 */
package javaMisc;

/**
 * @author 212720190
 * @date Feb 10, 2020
 */
public enum EnumCheck {
NEW("new"), TEST("test"), DIFF("diff");
	
	 private EnumCheck(String val) { //Illegal modifier for the enum constructor; only private is permitted.
		 // as enum cannot be instantiated
		this.val = val;
	}
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	
}
