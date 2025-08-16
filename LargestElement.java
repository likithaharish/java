
public class LargestElement {

	
	public static void main(String[] args) {
		
		int arr[]={10,40,60,50,90,20};
		int lar=0;
		for(int i=0;i<arr.length;i++){
	
			if(lar<arr[i]){
				lar=arr[i];
			}
		}
		
		System.out.println(lar);
		
	}

}
