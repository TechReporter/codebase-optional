/**
 * 
 */
package util;

import com.hazelcast.jet.function.FunctionEx;

/**
 * @author 212720190
 * @date Sep 1, 2019
 */
public final class CustomFunction {

	private CustomFunction() {
		
	}	
	public static <T> FunctionEx<T, T> customWholeItem() {
		return FunctionEx.identity();
	}
}
 