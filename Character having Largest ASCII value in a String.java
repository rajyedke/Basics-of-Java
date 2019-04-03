import java.util.Scanner;
public class Solution{

	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		char large='0';
		for(int i=0;i<st.length();i++)
			if((int)st.charAt(i)>(int)large)
				large=st.charAt(i);
		
		System.out.println("Character having Largest ASCII value is "+large);
	}
	
}
