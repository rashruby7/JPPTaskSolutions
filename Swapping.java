package Jpptaskperform;

import java.util.Scanner;

//swapping two string varibles without using third varible 
public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("first string is :");
		String str1=sc.nextLine();
		
		System.out.println("Second String is :");
		String str2=sc.nextLine();
		
		System.out.println("Before Swapping firstString: "+str1+"second string: "+str2);
		
		//swap the strings
		  //concat str1 with str2 
		str1=str1+str2; 
		
		//strore intial value of str1 into str2
		str2=str1.substring(0,str1.length()-str2.length());  
		
		//store intital value of str2 into str1
		str1=str1.substring(str2.length());
		
		System.out.println("After Swapping firstString: "+str1+"second string: "+str2);

		
	}
}
