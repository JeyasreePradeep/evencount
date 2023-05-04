package org.git;

public class OddNumberCount {
	public static void main(String[] args) {
		int count=0,sum=0;
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number");
				sum=sum+i;
				count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
	}
   
}

