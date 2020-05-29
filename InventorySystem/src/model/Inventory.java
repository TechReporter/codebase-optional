/**
 * 
 */
package model;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */
public class Inventory {

	private ItemType itemType;
	private Integer itemPrice;
	private Integer itemCount;
	
	public Inventory(ItemType itemType, Integer itemPrice, Integer itemCount) {
		super();
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
	}
	
	public Inventory(ItemType itemType, Integer itemPrice) {
		this.itemType = itemType;
		this.itemPrice = itemPrice;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}
	
}
