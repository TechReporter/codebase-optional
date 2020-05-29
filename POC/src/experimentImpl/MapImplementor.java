/**
 * 
 */
package experimentImpl;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author 212720190
 * @date Sep 7, 2019
 */
public class MapImplementor<K,V> extends HashMap<K, V> 
			implements CustomMap<K, V>, Cloneable, Serializable {
	private static final long serialVersionUID = 362498820763181265L;
	
	Integer computeIfAbsentCustom(K k,V v) {
		return (int)v*10;
	}
}
