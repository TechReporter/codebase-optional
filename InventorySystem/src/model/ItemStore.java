/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */
public class ItemStore {

	private String itemlocation;
	private Map<ItemType, Inventory> storeMap = new HashMap<ItemType, Inventory>();

	public ItemStore(String itemlocation, Inventory... storeMap) {
		super();
		this.itemlocation = itemlocation;
		for(Inventory inventory : storeMap) {
			this.storeMap.put(inventory.getItemType(), inventory);
		}
	}

	public String getItemLocation(ItemType item) {
		return itemlocation;
	}

	public Integer getItemPrice(ItemType item) {
		return storeMap.get(item).getItemPrice();
	}
	
	public Integer getItemCount(ItemType item) {
		return storeMap.get(item).getItemCount();
	}

	public static ItemStore initializeCountryStore(String country) {
		if(country.equalsIgnoreCase("argentina")) {
			return new ItemStore(InventoryConstants.ARGENTINA, new Inventory(ItemType.IPOD, InventoryConstants.ARGENTINA_IPOD_COST, InventoryConstants.ARGENTINA_IPOD),
					new Inventory(ItemType.IPHONE, InventoryConstants.ARGENTINA_IPHONE_COST, InventoryConstants.ARGENTINA_IPHONE));
		} else if(country.equalsIgnoreCase("brazil")) {
			return new ItemStore(InventoryConstants.BRAZIL, new Inventory(ItemType.IPOD, InventoryConstants.BRAZIL_IPOD_COST, InventoryConstants.BRAZIL_IPOD),
					new Inventory(ItemType.IPHONE, InventoryConstants.BRAZIL_IPHONE_COST, InventoryConstants.BRAZIL_IPHONE));
		} else {
			return null;
		}
	}

}
