import java.util.Scanner;
public class Solution{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
				char large='0';
		for(int i=0;i<st.length();i++)
			
			if((int)st.charAt(i)>(int)large)
				large=st.charAt(i);
		
				System.out.println(large);
	}
	
}
