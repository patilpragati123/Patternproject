package com.tskjspider;

import java.util.Scanner;

public class Primenumber {
	public static boolean isPrime(int n)
	{
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
				
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int []num=new int[10];
		for (int i=0;i<=9;i++)
		{
			System.out.println("Enter the no. at indedx" +i);
			num[i]=sc.nextInt();
		}
		for (int i=0;i<=9;i++)
		{
			if(isPrime(num[i]))
			{
				System.out.println(num[i]);
			}
		
	}

}
}