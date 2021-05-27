package com.Lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Exercise2 {

	public static void main(String[] args)throws Exception {
			 System.out.println("press 1 for Red");
				System.out.println("press 2 for Green");
				System.out.println("press 3 for Yellow");
				
				System.out.println("Enter your choice");
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String b=br.readLine();
				int c=Integer.parseInt(b);

				
				switch(c) {
				case 1 :  red();
					break;
				case 2: green();
					break;
				case 3 : yellow();
					break;
		
		// TODO Auto-generated method stub

		
				}
				}
				
			

			private static void yellow() {
				// TODO Auto-generated method stub
				System.out.println("Ready");
				
			}

			private static void green() {
				// TODO Auto-generated method stub
				System.out.println("Go");
			}

			private static void red() {
				// TODO Auto-generated method stub
				System.out.println("Stop");
			}
		}

