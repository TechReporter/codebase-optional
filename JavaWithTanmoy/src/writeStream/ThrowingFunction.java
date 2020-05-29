/**
 * 
 */
package writeStream;

import java.util.function.Function;

@FunctionalInterface
public interface ThrowingFunction<T, R, E extends Throwable>{

	R applyException(T t) throws E;
	
	static<T, R, E extends Throwable> Function<T, R>uncheckedFunc(ThrowingFunction<T,R,E> f) {
		return t -> 
		{
			try {
				return f.applyException(t);
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		};
	}
	
}
