package com.practice;

public class Rohit {

	static long sumOfSeries(int n) {
        long s = (long)n * (n + 1) / 2;
        return s * s;
    }
	
	public static void main(String[] args) {

		System.out.println(sumOfSeries(5));
	}
	
	
}
