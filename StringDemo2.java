
public class StringDemo2 {

	
	public static void main(String[] args) {
		
		String s="--a---b--c----d--e-f";
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)=='-'){
				count++;
				
			}
			if(s.charAt(i)!='-'||count==1){
				s1=s1+s.charAt(i);
				if(s.charAt(i)!='-'){
					count=0;
				}
			}
		
		
	  }
		System.out.println(s1);
	
	}

}
