import java.util.*;
public class Solution {
	public static void main(String[] args) {
  
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
    
		char [] st_char=new char[100];
		char large='0';
    
		for(int i=0;i<st.length();i++)
			st_char[i]=st.charAt(i);
      
		for(int i=0;i<100;i++) {
			if((int)st_char[i]>(int)large)
				large=st_char[i];
		}
    
				System.out.println("Character having largest ASCII value is " + large);
	}
}
