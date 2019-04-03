/*
4.Create Solution class with main method. 
Read a String value using Scanner. 
The program should print sum of digits in that String. Input String may have non digit characters too, which should be ignored.
Consider below sample input and output:

Input:
DaTa#abC123ww

Output:
6
*/

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int num=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)>'0' && st.charAt(i)<'9')
				num=num+(int)st.charAt(i)-'0';
		}
		System.out.println(num);
	}

}
