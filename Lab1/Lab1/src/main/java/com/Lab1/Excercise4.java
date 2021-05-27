package com.Lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	

public class Excercise4 {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number:");
		String num=br.readLine();
		int c=Integer.parseInt(num);
		
		for(int i=2;i<=c;i++)
		{
	         int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					count++;
				}
			}
		if(count==0) {
			System.out.println(i+" ");
		}
	}
	}

}
