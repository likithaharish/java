
public class StrinfSortingLength {

	
	public static void main(String[] args) {
		
		String str[]={"hi","love","my","i","india"};
		
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				
				if(str[i].length()>=str[j].length()){
					
					String s=str[i];
					str[i]=str[j];
					str[j]=s;
					
				}
				
			}
		}
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
	}

}
