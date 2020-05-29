/**
 * 
 */
package designPattern.observer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 212720190
 * @date Dec 15, 2019
 */
public class Observable {
	Map<Object, ObserverListener> map = new ConcurrentHashMap<>();

	void registerObserver(Object key, ObserverListener value) {
		map.put(key, value);
	}

	void unregistarObserver(Object key) {
		map.remove(key);
	}

	public void sendEvent(Object event) {
		for (ObserverListener listener : map.values()) {
			listener.onEvent( event );
		}
	}
}
