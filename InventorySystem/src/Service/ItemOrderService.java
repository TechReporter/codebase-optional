/**
 * 
 */
package Service;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import model.Inventory;
import model.InventoryConstants;
import model.ItemOrder;
import model.ItemStore;
import model.ItemType;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */
public class ItemOrderService {
	Map<String, ItemStore> orderByCountry = new HashMap<String, ItemStore>();

	public void orderFulfill(String input) {
		initializeItemStore();
		ItemStore itemStore = orderByCountry.get(input.split(":")[0]);
		ItemOrder itemOrder = getOrder(input);
	}

	private void initializeItemStore() {
		ItemStore brazilStore = ItemStore.initializeCountryStore("brazil");
		ItemStore argentinaStore = ItemStore.initializeCountryStore("Argentina");
		orderByCountry.put(InventoryConstants.BRAZIL, brazilStore);
		orderByCountry.put(InventoryConstants.ARGENTINA, argentinaStore);
	}
	
	private ItemOrder getOrder(String input) {
		String[] str = input.split(":");
		if(str.length==6) {
			return new ItemOrder(orderByCountry.get(str[0]), str[1], new Inventory(ItemType.valueOf(str[2]), 
					Integer.getInteger(str[3])),
					new Inventory(ItemType.valueOf(str[4]), 
							Integer.getInteger(str[5])));
		}
		else if(str.length==5) {
			return new ItemOrder(orderByCountry.get(str[0]), null, new Inventory(ItemType.valueOf(str[1]), 
					Integer.getInteger(str[2])),
					new Inventory(ItemType.valueOf(str[3]), 
							Integer.getInteger(str[4])));
		}
		else {
			throw new InputMismatchException();
		}
	}
	
	private ItemStore foreignStore(ItemStore itemStore) {
		for(Map.Entry<String, ItemStore> map : orderByCountry.entrySet()) {
			if(itemStore !=map.getValue()) {
				return map.getValue();
			}
		}
		return null;
	}
	
	private void validateItemStock(ItemOrder itemOrder, ItemStore homeItemStore) throws Exception {
		ItemStore foriegnStore = foreignStore(homeItemStore);
		
		if(itemOrder.getItemCount(ItemType.IPHONE)>
		homeItemStore.getItemCount(ItemType.IPHONE)+foriegnStore.getItemCount(ItemType.IPHONE)
		|| itemOrder.getItemCount(ItemType.IPOD)>
		homeItemStore.getItemCount(ItemType.IPOD)+foriegnStore.getItemCount(ItemType.IPOD)) {
			throw new Exception();
		}
	}
	
}
