
public class Pattern1 {

	
	public static void main(String[] args) {
		
		int z=1;
		for(int i=0;i<5;i++){
			
			for(int j=5;j>i;j--){
				System.out.print(" ");
				
			}
			for(int k=1;k<=z;k++){
				System.out.print("1");
			}
			z+=2;
			System.out.println(" ");
			
		}
		
		
	}

}
