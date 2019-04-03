*/Read a String value using Scanner.
The program should print largest and smallest character (as per ASCII sqeuence) together. 
Consider below sample input and output (Output refers 'o' as largest and 'P' as smallest as we are following ASCII sequence):

Input:
Phone

Output:
oP/*
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		char large='0', small='z';
		for(int i=0;i<st.length();i++) {
			
			if((int)st.charAt(i)>(int)large)
				large=st.charAt(i);
			
		if((int)st.charAt(i)<(int)small)
			small=st.charAt(i);
		}
				System.out.println(large+""+small);
	}
	
}
