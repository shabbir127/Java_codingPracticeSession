package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Test {
	
	int n = 1;
	

 synchronized void even() throws Exception{
	 

	        while (n <= 10) {

	            if (n % 2 == 0) {
	                wait();
	            }

	            System.out.println("Odd : " + n);
	            n++;

	            notify();
	        }

 }
	
 synchronized void odd() throws Exception{
	{
		int n = 1;


	        while (n <= 10) {

	            if (n % 2 != 0) {
	                wait();
	            }

	            System.out.println("Even : " + n);
	            n++;

	            notify();
	        }
	        
	}
 }
	public static void main(String[] args) {
		
		int arr[]= {2,3,2,4,6,6,3,5,3,4};
		
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> duplicate=new HashSet<>();
		
		for(int num:arr)
		{
			if(!set.add(num))
			{
				duplicate.add(num);
			}
			
		}
		System.out.println(duplicate);
		
		//reverse string...
		
		String str="shabbir";
		
		
		char[] word=str.toCharArray();
		
		int right=word.length-1;
		int left=0;
		while(left < right)
		{
			char temp=word[left];
			word[left]=word[right];
			word[right]=temp;
			left++;
			right--;
			
		}
		
		System.out.println(word);
	
		//
		
		for(int i=0; i<str.length();i++)
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.print(str.charAt(i));
			}
		}
		
		//reverse the word
		String reverseWord="Welcome to java home";
		
		String stringArray[]=reverseWord.split(" ");
		
		//String stringBuilder="";
		System.out.println();
//		for(int i=stringArray.length-1;i>=0;i--)
//		{
//		    stringBuilder=stringBuilder+stringArray[i];
//		}
//		System.out.println(stringBuilder);
//		
		for(int i=stringArray.length-1;i>=0;i--)
		{
			System.out.print(stringArray[i]+" ");
		}
		
		Arrays.stream(reverseWord.split(" ")).map(wor->new StringBuilder(wor).reverse()).collect(Collectors.joining());
		System.out.println(Arrays.stream(reverseWord.split(" ")).map(wor->new StringBuilder(wor).reverse()).collect(Collectors.joining(" ")));
		
		String input[]={"hello"," ","ant","hello","world"};
		
		for(String s:input)
		{
			if(!s.isEmpty())
			{
				if (s.startsWith("a")) {
                    System.out.println(s);					
				}
			}
		}
		
		
		
		int n=4;
		
		int space=n;
		
		for(int i=0;i<n;i++)    
		{
			int number=1;
			
			for(int s=1;s<=space;s++ )
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			space --;
			System.out.println();
		}
		
		List<Employee> employees=Arrays.asList(new Employee(1,"Vivek", 25000),
				                               new Employee(2, "Shabbir", 22000),
				                               new Employee(3, "Sujit", 42000),
				                               new Employee(4, "Rohit", 78000)
				                               );
		
		//employees.stream().flatMap(emp->emp.getSalary().stream()).collect(Collectors.toList());
		List<Integer>list1=Arrays.asList(1,2,4,4,5,6,9);
		System.out.println(list1.stream().max(Integer::compare).get());
		
		System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)).get());
		
		  System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).toList());
		  Arrays.stream(reverseWord.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  


		   final Object lock1=new Object();
		   final Object lock2=new Object();
		  
		  Thread t1=new Thread(()-> {
			  synchronized (lock1) {
				System.out.println("Thread1 using lock1");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (lock2) {
					System.out.println("Thread1 using lock2");
			  }
			}
			  
		  
		  });
		  
		  Thread t2=new Thread(()-> {
			  synchronized (lock2) {
				System.out.println("Thread2 using lock2");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (lock1) {
					System.out.println("Thread2 using lock1");
			  }
			}
			  
		  
		  });
		  //t1.start();
		 // t2.start();
		  
		  Test test=new Test();
		 Thread t3=new Thread(()->
		 {
			 try {
				test.even();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 });
		 Thread t4=new Thread(()->
		 {
			 try {
				test.odd();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 });
		 
		 t3.start();
		  t4.start();
		  
		  
	}

}





class Employee{
	
	
	private int id;
	private String empName;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String empName, int salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
}
