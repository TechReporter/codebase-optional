/**
 * 
 */
package designPattern.decorator;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public abstract class HatchBackCar implements Car {
	private Car car;

	public HatchBackCar(Car c) {
		this.car = c;
	}

	protected abstract int calculateDistance(int d);

	@Override
	public final int distance(int mileage, int oil) {
		int d = car.distance(mileage, oil);
		System.out.println("hatchback car distance ::"+d);
		return calculateDistance(d);
	}

}
