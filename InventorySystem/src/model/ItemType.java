/**
 * 
 */
package model;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */
public enum ItemType {
	IPOD("IPOD"),IPHONE("IPHONE");

	String type;
	private ItemType(String item) {
		this.type = item;
	}

	public String getType() {
		return type;
	}
}
