*/
3. Create Solution class with main method. 
Read a String value using Scanner. 
The program should print the count of upper case and lower case alphabet characters in that String (print output in separate lines).
Consider below sample input and output:

Input:
DaTa#abC123

Output:
3
4
/*


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int count_caps=0, count_small=0;
		for(int i=0;i<st.length();i++)
		{
			if((int)st.charAt(i)>=(int)'A' && (int)st.charAt(i)<=(int)'Z')
				count_caps++;
			if((int)st.charAt(i)>=(int)'a' && (int)st.charAt(i)<=(int)'z')
				count_small++;
		}	
		System.out.println("Number of Capital Letters are " + count_caps);
		System.out.println("Number of Small Letters are " + count_small);
	}
	
}
