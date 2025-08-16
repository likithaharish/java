
public class SophieGermainPrimeNumbers {

	
	public static void main(String[] args) {
		
		int count;
		for(int num=2;num<150;num++){
			count=0;
			for(int i=2;i<=num/2;i++){
				
				if(num%i==0){
					count++;
					break;
				}
			}
			
			if(count==0){
				int res=num;
				res=(res*2)+1;
				int flag=0;
				for(int j=2;j<=res/2;j++){
					
					if(res%j==0){
						flag++;
						break;
					}
					
				}
				if(flag==0){
					System.out.println(num);
				}
				
				
			}
		}
	}

}
