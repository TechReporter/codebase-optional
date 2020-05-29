/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */
public class ItemOrder {
	
	private String passport;
	private String nationality;
	private ItemStore itemStore;
	private Map<ItemType, Inventory> orderMap = new HashMap<ItemType, Inventory>();
	
	
	public ItemOrder(ItemStore itemStore, String passport, Inventory... itemInventory) {
		super();
		this.passport = passport;
		this.itemStore = itemStore;
		setNationality();
		setOrderMap(itemInventory);
	}
	
	public void setNationality() {
		if(passport!=null) {
			if(InventoryConstants.BRAZIL_REGEX.matcher(passport).find(0)) {
				this.nationality = InventoryConstants.BRAZIL;
			} else if(InventoryConstants.ARGENTINA_REGEX.matcher(passport).find(0)) {
				this.nationality = InventoryConstants.ARGENTINA;
			}
		}
	}
	
	public Set<ItemType> getOrderMapItems() {
		return orderMap.keySet();
	}

	public String getNationality() {
		return nationality;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public ItemStore getItemStore() {
		return itemStore;
	}

	public void setItemStore(ItemStore itemStore) {
		this.itemStore = itemStore;
	}
	
	public void setOrderMap(Inventory... inventory) {
		for(Inventory orderInventory : inventory) {
			orderMap.put(orderInventory.getItemType(), orderInventory);
		}
	}

	public Integer getItemCount(ItemType itemType) {
		return this.orderMap.get(itemType).getItemCount();
	}

	public int getItemPrice(ItemType itemType) {
		return this.orderMap.get(itemType).getItemPrice();
	} 
}
