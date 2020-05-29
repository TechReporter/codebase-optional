/**
 * 
 */
package com;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author 212720190
 * @date Nov 30, 2018
 */
public class SplitItrMain {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12,134,33,11,443,25,4,311);
		Spliterator<Integer> splitList = list.spliterator();
		System.out.println("splitList.estimateSize() SIZE == :::"+splitList.estimateSize());
		System.out.println(splitList.getExactSizeIfKnown());
		
		splitList.forEachRemaining(e -> System.out.println(e));
		
	}

}
