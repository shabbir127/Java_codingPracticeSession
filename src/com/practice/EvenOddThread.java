package com.practice;

public class EvenOddThread extends Thread{
	int number=10;
	int start=1;
	
	public synchronized void printNumber()
	{
		while(start <= number)
		{
			if(start %2==0)
			{
				try {
					wait();
				} catch (InterruptedException  e) {
					Thread.currentThread().interrupt();
				}
			}else {
				System.out.println("odd number: "+ start);
				start++;
				notify();
			}
		}
		while(start <= number)
		{
			if(start %2!=0)
			{
				try {
					wait();
				} catch (InterruptedException  e) {
					Thread.currentThread().interrupt();
				}
			}else {
				System.out.println("Even number: "+ start);
				start++;
				notify();
			}
		}
	}
	
	
	public static void main(String[] args) {
		EvenOddThread t1=new EvenOddThread();
		
		Thread thread=new Thread(t1);
		thread.start();
		
	}

}
