import java.util.Scanner;
public class Divisibility {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        System.out.println("Results:");
        if(num % 2 == 0) {
            System.out.println(num + " divisible by 2");
        } else{
            System.out.println(num + "NOT divisible by 2");
        }

}
}