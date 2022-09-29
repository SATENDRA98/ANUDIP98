package com.javatest.bll;
import java.util.ArrayList;

public class MinimumFront {
	 
	public static void minToFront(ArrayList<Integer> array) {
	    int minIndex = 0;
	    
	    for (int i = 1; i < array.size(); i++) {
	        if (array.get(minIndex) > array.get(i)) {
	            minIndex = i;
	        }
	    }
	    
	    int minValue = array.remove(minIndex);
	    array.add(0, minValue);
	}
		

}