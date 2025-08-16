
public class RemoveDuplicateWord {

	
	public static void main(String[] args) {
		
		
		String s1[]={"india","i","hello","my","india","i","my","country","india"};
		
		
		for(int i=0;i<s1.length;i++){
			
			
			for(int j=i+1;j<s1.length;j++){
				
			
				if(s1[i].length()==s1[j].length()){
					
					int count=0;
					for(int k=0;k<s1[i].length();k++){
						
						if(s1[i].charAt(k)==s1[j].charAt(k)){
							count++;
						}
					}
					
					if(count==s1[i].length()){
						s1[j]="00";
					}
					
				}
				
			}
			
		}
		
		for(int i=0;i<s1.length;i++){
			if(s1[i]=="00"){
				
			}else{
				System.out.print(s1[i]+" ");
				
			}
			
		}
	}

}
