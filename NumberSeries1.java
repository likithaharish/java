
//series is 6,9,23,87,429.....

public class NumberSeries1 {

	
	public static void main(String[] args) {
		
		int num=8;
		int res=1;
		for(int i=1;i<8;i++){
			
		num=(num*res)-(++res);
		System.out.println(num);
			
		}
		
	}

}
