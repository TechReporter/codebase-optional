/**
 * 
 */
package com.hexad.model;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingMainTest {

	private File file = null;
	private Scanner sc = null;
	Map<Integer, String> map = new TreeMap<>();
	Map<Integer, ParkingSlot> allocateCarParking = new TreeMap<>();


	@Before
	public void setup()
			throws IOException
	{
		file = new File(ParkingLotConstants.FILEPATH);
		sc = new Scanner(file);
		sc = new Scanner(file);
		int lines = 1;
		while (sc.hasNextLine())  {
			map.put(lines, sc.nextLine());
			lines++;
		}
		for(int i =0; i<6;i++) {
			allocateCarParking.put(i, 
					new ParkingSlot(i, new Car("test_data", "test_color")));
		}
	}

	@Test
	public void loadParkinglotDataTest()
			throws IOException
	{
		try {
			assertEquals("test data load from file", ParkingMain.loadParkinglotData(),map);
		} finally {
			if (sc != null)
			{
				sc.close();
			}
		}
	}
	
	@Test
	public void removeCarParkingTest() {
		ParkingMain.removeCarFromParking(allocateCarParking, 4);
		Assert.assertEquals(" vvv",5 ,allocateCarParking.size());

	}

}
