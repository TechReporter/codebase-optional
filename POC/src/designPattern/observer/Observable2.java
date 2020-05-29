/**
 * 
 */
package designPattern.observer;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class Observable2 implements ObserverListener {
	
	public Observable2(Observable observable) {
         observable.registerObserver( this, this );
     }


	@Override
	public void onEvent(Object event) {
        System.out.println("2nd "+event);
		
	}



}
