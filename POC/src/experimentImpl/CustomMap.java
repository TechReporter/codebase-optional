/**
 * 
 */
package experimentImpl;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * @author 212720190
 * @date Sep 7, 2019
 */
public interface CustomMap<K,V> extends Map<K, V> {

	//@Override
	  default V computeIfAbsentCustom(K key,
	            Function<? super K, ? extends V> mappingFunction) {
	        Objects.requireNonNull(mappingFunction);
	        V v;
	     
	        if((v = get(key)) == null) {
	        	V newVal;
	        	if((newVal=mappingFunction.apply(key)) !=null) {
	        		Integer val = (int)newVal*10;
	        		put(key, (V)val);
	        		return newVal;
	        	}
	        }

	        return v;
	    }
	  
	  
	  
	  
}
