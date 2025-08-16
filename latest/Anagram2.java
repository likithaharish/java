
public class Anagram2 {

	public static void main(String[] args) {

		String s1="mo th er";
		String s2="mother";
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		int count=0;
		
		for(int i=0;i<s1.length();i++){
			
			if(s1.charAt(i)!=' '){
				sb1.append(s1.charAt(i));	
		  }
		}
		
           for(int i=0;i<s2.length();i++){
			
			if(s2.charAt(i)!=' '){
				sb2.append(s2.charAt(i));	
		  }
		}
		
		if(sb1.length()==sb2.length()){
			
			
			for(int i=0;i<sb1.length();i++){
				for(int j=0;j<sb2.length();j++){
					
					if(sb1.charAt(i)==sb2.charAt(j)){
						count++;
						break;
					}
					
				}
			}
			
		}else{
			count=0;
		}
		
		if(count==sb1.length()){
			System.out.println("it is angram");
		}else{
			System.out.println("it is not anagram");
		}
		
	}

}
