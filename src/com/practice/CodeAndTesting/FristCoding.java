package com.practice.CodeAndTesting;

import java.util.Arrays;
import java.util.List;

public class FristCoding {
	
	static boolean palindromeString(String string)
	{
		char ch[] =string.toCharArray();
		
		int left=0;
		int right=ch.length-1;
		
		while(left <right)
		{
			if(ch[left]!=ch[right])
			{
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}
	
	
	static boolean allPalindrome(int arr[])
	{
		for(int num:arr)
		{
			int orginal=num;
			int reverse=0;
			
			while(num >0)
			{
				int digit=num % 10;
				reverse=reverse*10 + digit;
				num=num/10;
			}
			if (orginal != reverse) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int countOfElements(int x, List<Integer> arr) {
		int count=0;
		for(int num: arr)
		{
			if(num <= x)
			{
				count++;
			}
		}
		
		return count;
	}
	
	static void palindromeStringTest(String input,boolean expected)
	{
		boolean actual=palindromeString(input);
		
		if (actual == expected) {
			System.out.println("PASS : " + input);
        } else {
            System.out.println("FAIL : " + input +
                    " Expected=" + expected +
                    " Actual=" + actual);
        
		}
	}
	
	public static void main(String[] args) {
		
		palindromeStringTest("madam",true);
		palindromeStringTest("hello", false);
		palindromeStringTest("abba", true);
		palindromeStringTest("abcba", true);
		palindromeStringTest("ab", false);
        palindromeStringTest("a", true);
        palindromeStringTest("", true);
        int arr[]= {111,222,333,444,555};
        System.out.println(allPalindrome(arr));
        
        List<Integer> list=Arrays.asList(10, 1, 2, 8, 4, 5);
		System.out.println(countOfElements(9,list));
	}

}
