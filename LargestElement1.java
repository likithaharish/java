
public class LargestElement1 {

	static int i=0,max=0;
	public static void main(String[] args) {
		
		int arr[]={10,50,90,80,60,20};
		
		
		int lar=largest(arr);
		System.out.println(lar);
	}

	 static int largest(int arr[]){
		 
		if(i<arr.length){
			if(max<arr[i]){
				max=arr[i];
			}
			i++;
			largest(arr);
			
		}
		 
		 return max;
	 }

}
