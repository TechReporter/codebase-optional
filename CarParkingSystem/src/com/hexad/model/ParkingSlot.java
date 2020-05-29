/**
 * 
 */
package com.hexad.model;

/**
 * @author 212720190
 * @date Feb 19, 2019
 */
public class ParkingSlot {

	private int slotId;
	private Car allotedCar;
	
	public ParkingSlot(int slotId, Car allotedCar) {
		super();
		this.slotId = slotId;
		this.allotedCar = allotedCar;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public Car getAllotedCar() {
		return allotedCar;
	}

	public void setAllotedCar(Car allotedCar) {
		this.allotedCar = allotedCar;
	}

	@Override
	public String toString() {
		return "ParkingSlot [slotId=" + slotId + ", allotedCar=" + allotedCar + "]";
	}
}
