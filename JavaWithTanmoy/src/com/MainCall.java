/**
 * 
 */
package com;

import java.util.Spliterator;
import java.util.concurrent.Callable;

public class MainCall implements Callable<String>{

	 private Spliterator<Library> spliterator;
	    private final static String SUFFIX = "- published by Tanmoy";

	    public void Task(Spliterator<Library> spliterator) {	
	        this.spliterator = spliterator;
	    }

	    @Override
	    public String call() {
	        int current = 0;
	        while (spliterator.tryAdvance(lib -> {
	            lib.setDeptName(lib.getDeptName()
	                .concat(SUFFIX));
	        })) {
	            current++;
	        }
	        ;
	        return Thread.currentThread()
	            .getName() + ":" + current;
	    }
}
