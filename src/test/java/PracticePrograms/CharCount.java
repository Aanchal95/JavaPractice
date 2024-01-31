package PracticePrograms;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int i=0;
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		while(i<str1.length()) {
			if(str1.charAt(i)=='a')
			{
				count++;
			}
			i++;
			
		}
		System.out.println("Count of a in string is :"+count);
		// TODO Auto-generated method stub

	}

}
