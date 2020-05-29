/**
 * 
 */
package designPattern.observer;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class Observable1 {
	
	public Observable1(Observable observable) {
         observable.registerObserver( this, new ObserverListener() {
             @Override
             public void onEvent( Object event ) {
                 System.out.println("1st "+event);
             }
         } );
     }

}
