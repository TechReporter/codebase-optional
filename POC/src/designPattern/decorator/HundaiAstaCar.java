/**
 * 
 */
package designPattern.decorator;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class HundaiAstaCar extends HatchBackCar {
	
	public HundaiAstaCar(Car c) {
		super(c);
	}

	@Override
	protected int calculateDistance(int d) {
		int distance = HatchBack.hundaiAsta(d);
		System.out.println("Hundai asta :: "+distance);
		return distance;
	}
	



}
