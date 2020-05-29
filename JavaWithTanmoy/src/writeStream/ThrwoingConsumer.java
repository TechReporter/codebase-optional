/**
 * 
 */
package writeStream;

import java.util.function.Consumer;

@FunctionalInterface
public interface ThrwoingConsumer<T, E extends Throwable> {

	void accept(T t) throws E; 
	
	static<T, E extends Throwable> Consumer<T> uncheckedFunc(ThrwoingConsumer<T, E> f) {
		
		return t -> {
			try {
				f.accept(t);
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		};
		
	}
}
