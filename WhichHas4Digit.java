
public class WhichHas4Digit {

	public static void main(String[] args) {
		
		
		int arr[]={2,4,20,24,44,56,68};
		int rem,count=0;
		
		for(int i=0;i<arr.length;i++){
			
			int num=arr[i];
			while(num!=0){
				rem=num%10;
				if(rem==4){
					count++;
					break;
				}
				num=num/10;
				
			}
		}
		System.out.println("the number of 4 digit present in ths series are= "+count);
		
	}

}
