package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Restart {

	public static void main(String[] args) {
		        int arr[] = {1,2,2,3,4};
		       
		        int j=0;
		       for(int i=1;i<arr.length;i++)
		       {
		    	   if(arr[i]!=arr[j])
		    	   {
		    		   j++;
		    		   arr[j]=arr[i];
		    		   
		    	   }
		       }
	     
		        for(int i=0;i<=j;i++)
		        {
		        System.err.print(arr[i]);
		        }
		        
		        
		    //even or odd...
		        
		        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,1);
		        
		        Map<Boolean, List<Integer>> map=list.stream().collect(Collectors.partitioningBy(x-> x%2==0));
		        System.out.println(map);
		     
		    //
		        Set<Integer> set=new HashSet<>();
		        
		        list.stream().filter(x-> !set.add(x)).forEach(System.out::println);
		   //
		       int SecondHeight= list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		  System.out.println(SecondHeight);
		  List<Employee> employees=Arrays.asList(new Employee(1,"Vivek", 25000),
                  new Employee(2, "Shabbir", 22000),
                  new Employee(3, "Sujit", 42000),
                  new Employee(4, "Rohit", 78000)
                  );
		  
		  
		  employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
	
	}
}

