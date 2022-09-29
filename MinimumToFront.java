package com.javatest.bll;
import java.util.ArrayList;

public class MinimumToFront extends MinimumFront{

	public static void main(String[] args) {
		//{3, 8, 92, 4, 2, 17, 9} 
		
			    ArrayList<Integer> origList = new ArrayList<Integer>();
			    origList.add(3);
			    origList.add(8);
			    origList.add(92);
			    origList.add(4);
			    origList.add(2);
			    origList.add(17);
			    origList.add(9);
			    System.out.println("Original List :-");
			    System.out.println(origList);
			   
			    System.out.println("List after performing minToFront method :-");
			    minToFront(origList);
			    System.out.println(origList);
			    	    
	 }

}