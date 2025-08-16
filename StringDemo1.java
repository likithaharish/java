
public class StringDemo1 {

	
	public static void main(String[] args) {
		
		String s="--a--b--c--d--e--f";
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)=='-'){
				count++;
				
			}
			if(count==2){
				count=0;
				
			}else{
				s1=s1+s.charAt(i);
			}
		
		
	  }
		System.out.println(s1);
	}

}
