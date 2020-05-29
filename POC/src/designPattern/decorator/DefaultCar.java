/**
 * 
 */
package designPattern.decorator;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class DefaultCar implements Car {


	@Override
	public int distance(int mileage, int oil) {
		return mileage*oil;
	}


}
