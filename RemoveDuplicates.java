package Jpptaskperform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

//Remove Duplicate Elements from Arraylist 


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,2,4,1,3,5,6,4,7,4,5,9,1,9,5,7,0,1,0));
		
		//converted arraylist into linkedhashset as it dont allow duplicate values
		LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<Integer>(numbers);
		
		//store linkedhaset elemnts into another arraylist
		ArrayList<Integer> numwithoutdup=new ArrayList<>(linkedhashset);
		
		System.out.println("Ater removing duplicate elements:"+numwithoutdup);	
	}
}
