/**
 * 
 */
package designPattern.decorator;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class HondaBrioCar extends HatchBackCar {
	
	public HondaBrioCar(Car c) {
		super(c);
	}

	@Override
	protected int calculateDistance(int d) {
		int distance = HatchBack.hondaBrio(d);
		System.out.println("Honda brio :: "+distance);
		return distance;
	}
	


	


	
	

}
