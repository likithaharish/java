import java.util.Scanner;


public class ReverseString1 {

	
	public static void main(String[] args) {
		
		String s="";
		String s1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
			
		}
		
		System.out.println(s1);
	}

}
