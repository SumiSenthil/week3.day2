package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindSecondLargest {

	public static void main(String[] args) {
		int[] num= {2,4,5,6,8};
		
		List<Integer> dups=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			dups.add(num[i]);	
			
		}
		 Collections.sort(dups);//sorting
	     int Total=dups.size();
	    System.out.println(dups.get(Total-2));	
		
	}

}
