package com.logic;

public class PrimeNu {

	public static void main(String[] args) {
		
		int i,m=0,n=10,flag=0;
		
		m=n/2;
		
		if(n==0 || n==1)
		{
			System.out.println(" is not prime number");
			
		}else
		{
			for(i=2; i<m;i++)
			{
				if(n%i==0)
				{
					System.out.println(" is not prime number:"+ n);
					
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(" is prime number:"+ n);
			}
		}
		
	}
}
