package com.logic;

public class ArraycheckElement {
	
	static void findMisssingElement(int a[], int b[], int n,int m)
	{
		
		for(int i=0;i<n;i++)
		{ int j;
			for(j=0;j<m;j++)
			if(a[i]==b[j])
				break;
			
			 if (j == m)
	                System.out.print(a[i] + " ");
	}//end of for
}//end of function


	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,3,4,5,6,};
		int n=a.length;
		int m=b.length;
		
		findMisssingElement(a, b, n, m);
	}

}

