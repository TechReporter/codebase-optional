/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */
public class TaxCalulation {
	
	private List<String> inputList;
	private List<String> outputList;
	private List<String> taxFreeItems;
	private double totalTax = 0.00;
	private double totalPrice = 0.00;
	
	public TaxCalulation(List<String> inputs) {
		this.inputList = inputs;
		this.outputList = new ArrayList<>();
		initializeTaxFreeItems();
	}
	
	public void calculateTax() {
		for(int i=0;i<inputList.size();i++) {
			StringBuilder strbldr = new StringBuilder();
			String item = inputList.get(i);
			String[] itemSeq = item.split(" ");
			for(int j=0;j<itemSeq.length-2;j++) {
				if(j==0)
				strbldr.append(itemSeq[j]);
				else
					strbldr.append(" "+itemSeq[j]);
			}
			strbldr.append(": ");
			double price = Double.parseDouble(itemSeq[itemSeq.length-1]);
			if(isTaxableItem(item)) {
				String finalPrice = taxableCalculation(item,price);
				strbldr.append(finalPrice);
				outputList.add(strbldr.toString());
			} else {
				String finalPrice = nonTaxableCalculation(item, price);
				strbldr.append(finalPrice);
				outputList.add(strbldr.toString());
			}
		}
		outputList.add("Sales Taxes: "+roundOffTo2DecPlaces((float)totalTax));
		outputList.add("Total: "+roundOffTo2DecPlaces((float)totalPrice));
	}
	
	private String taxableCalculation(String item, double price) {
		double itemTax = 0.00;
		if(item.contains((CharSequence)"imported")) {
			 itemTax = price*0.15;
		} else {
			 itemTax = price*0.10;
		}
		totalTax+=itemTax;
		totalPrice+=price+itemTax;
		return roundOffTo2DecPlaces((float)(price+itemTax));
	}
	
	private String nonTaxableCalculation(String item, double price) {
		double itemTax = 0.00;
		if(item.contains((CharSequence)"imported")) {
			 itemTax = price*0.05;
		} else {
			 itemTax = price*0.00;
		}
		totalTax+=itemTax;
		totalPrice+=price+itemTax;
		return roundOffTo2DecPlaces((float)(price+itemTax));
	}
	
	boolean isTaxableItem(String item) {
		for(int i=0;i<taxFreeItems.size();i++) {
			if(item.contains((CharSequence)taxFreeItems.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	private void initializeTaxFreeItems() {
		taxFreeItems = Arrays.asList("book","books","chocolate","chocolates","pills");
	}

	private String roundOffTo2DecPlaces(float val)
    {
        return String.format("%.2f", val);
    }

	public List<String> getOutputList() {
		return outputList;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
}
