/*
 6. Define main method in Solution class.

The program will read a String value. It will calculate total number of vowels in that string and print the answer.

Sample input:

internal

Output:

3
*/

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int count=0;
		for(int i=0;i<st.length();i++)
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u' )
				count++;
		System.out.println(count);
	}

}
