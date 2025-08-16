
public class ZerosOnces {

	public static void main(String[] args) {
		
		
		int arr[]={0,0,1,1,0,1,0,0,0,1};
		int j=arr.length-1;
		int i=0;
		int l=0;
		while(i<j){
			System.out.println(l++);
			
			if(arr[i]!=0){
				
				
				if(arr[j]==0){
					
					
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
					++i;
					--j;
					
				}else{
					
					--j;
				}
				
			}else{
				
				i++;
			}
		}
		
		
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
			
		}
	}

}
