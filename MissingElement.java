package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissingElement {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,7,6,8};
		
		List<Integer> dups=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			dups.add(num[i]);	
			
		}
		 Collections.sort(dups);//sorting
		 for(int i=0;i<num.length;i++)
			{
				if((i+1)!=dups.get(i))
				{
					System.out.println(i+1);
					break;
				}
				}
				
			}
	}


