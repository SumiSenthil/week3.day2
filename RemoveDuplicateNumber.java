package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		
		int[] num= {14,12,13,11,15,14,18,16,17,19,18,17,20,13};
		
		Set<Integer> RemoveDup= new LinkedHashSet<Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			RemoveDup.add(num[i]);
			}
		
			
			System.out.println(RemoveDup);
			/*List<Integer> allnum= new ArrayList<Integer>(RemoveDup);
			for(int i=1;i<allnum.size();i++)
			{
				if(i!=allnum.get(i-1))
				{
					System.out.println(i);
					RemoveDup.add(num[i]);
					//break;
				}
			
		}*/
	}

}
