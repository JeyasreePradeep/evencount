package org.git;

public class OddEven {
	public static void main(String[] args) {
		int sum=0,count=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0)
			{
				System.out.println("Even number");
				sum=sum+i;
				count++;
	}
			System.out.println(sum);
			System.out.println(count);
			
		}
		
	}

}
