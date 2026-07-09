package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class WorkingOnStream {
	
	/*   
	 long count = Arrays.stream(word)
                .flatMap(s -> Arrays.stream(s.split("[,\\s]+"))) // split by space & comma
                .filter(w -> w.equalsIgnoreCase("hello"))
                .count();

	 
	 */
	
	public static void main(String[] args) {
		
		String word[]={"hello  hello how are you, hello buddy , hello good night, Hello friend"};
		
	    /* 
		
		long count=Arrays.stream(word).flatMap(s->Arrays.stream(s.split("[,\\s]+"))).filter(w->w.equalsIgnoreCase("hello")).count();
	                // Array → Stream → Split into words → Flatten → Filter "hello" → Count      
	     System.out.println("Total count of hello is:- "+ count);
	     
	     
	     List<Integer> list=new ArrayList<>(Arrays.asList(1,3,5,9,7,8));
	     
	     List<Integer> Result=list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
	     System.out.println(Result);
	     
	     
	     List<Integer> oddResult=list.stream()
	     .filter(element-> element %2!= 0)
	     .map(element->element * element )
	     .toList();
	      
	     System.out.println(oddResult);
	     
	     List<Integer> list1=Arrays.asList(10,20,30,40,50);
	     
	     List<Integer> result1=list1.stream().skip(1).limit(2).toList();
	      System.out.println(result1);
	      
	      
	     
		 List<Integer> list=new ArrayList<>(Arrays.asList(20,10,10,45,30,5,45,20));
		 
		 int SecondHeight=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		
		 System.out.println(SecondHeight);
		 
		 
	Map<Boolean, List<Integer> > result =list.stream()
			.collect(Collectors.partitioningBy(elem-> elem % 2 ==0)); 
		System.out.println(result);
		
		*/
		
		 List<String> list1=Arrays.asList("java","Springboot","Python");
		 
		 String longestString=list1.stream().max(Comparator.comparing(s->s.length())).get();
	     
		 System.out.println(longestString);
		
		
	}

}
