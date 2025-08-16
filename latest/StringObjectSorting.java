


public class StringObjectSorting {
   static StringBuffer sb=new StringBuffer("i love my india");
   
	
	public static void main(String[] args) {
		
		int spa[]=new int[10];
		int j=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' '||i==sb.length()-1){
				System.out.println(i);
			}
			
		}
		
		for(int i=0;i<spa.length;i++){
			System.out.println(spa[i]);
			
		}
		
	}

}
