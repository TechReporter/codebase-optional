/**
 * 
 */
package model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author 212720190
 * @date Feb 14, 2020
 */

public class TaxCalulationTest {

	@Test
	public void testItem() {
		List<String> items = Arrays.asList("1 imported bottle of perfume at 27.99",
				"1 bottle of perfume at 18.99",
				"1 packet of headache pills at 9.75",
				"1 imported box of chocolates at 11.25");
		TaxCalulation taxCalculate = new TaxCalulation(items);
		taxCalculate.calculateTax();
		List<String> outputList = new ArrayList<String>();
        outputList.add("1 imported bottle of perfume: 32.19");
        outputList.add("1 bottle of perfume: 20.89");
        outputList.add("1 packet of headache pills: 9.75");
        outputList.add("1 imported box of chocolates: 11.81");
        outputList.add("Sales Taxes: 6.66");
        outputList.add("Total: 74.64");
		assertEquals(outputList, taxCalculate.getOutputList());
	}
}
