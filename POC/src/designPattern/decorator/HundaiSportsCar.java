/**
 * 
 */
package designPattern.decorator;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class HundaiSportsCar extends HatchBackCar {

	public HundaiSportsCar(Car c) {
		super(c);
	}

	@Override
	protected int calculateDistance(int d) {
		int distance = HatchBack.hundaiSports(d);
		System.out.println("Hundai sports :: "+distance);
		return distance;
	}
	

}
