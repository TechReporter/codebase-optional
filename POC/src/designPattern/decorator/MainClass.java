/**
 * 
 */
package designPattern.decorator;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class MainClass {


	public static void main(String[] args) {
		System.out.println(new HondaBrioCar(new HundaiAstaCar(
				new HundaiSportsCar(new DefaultCar()))).distance(15, 2));
	}

}
