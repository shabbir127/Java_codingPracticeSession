package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hello {

	
	public static void main(String[] args) {    
		
		int[] input= {2,7,11,15};
		int sum=26;
		int left=0;
		int right=input.length-1;
		
		while(left < right)
		{
			int result=input[left]+input[right];
			if(result == sum)
			{
				
				System.out.println((left)+" " +right);
				break;
			}else if (result < sum) {
				left++;
				
			}else {
				right--;
			}
	
						
		}
		//Character frequency
		String nameString="Shabbirkhan@gmail.com";
		Map<Character,Integer>map=new HashMap<>();
		
		for(char c:nameString.toCharArray())
		{
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c,map.get(c)+1);
			}

		}
		System.out.println(map);
		
        //remove duplicate using set
		int [] number= {1,2,3,4,5,6,6,7,7,12,3,5,6};
		Set<Integer>set=new HashSet<>();
		for(int n:number)
		{
			set.add(n);
		}
		System.out.println(set);
		
		//
	}
}
