//program to print values between a to b using for loop
import java.util.Scanner;
class q13{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b : ");
        int b = scan.nextInt();
        for (int i=a;i<=b;i+=1){
            System.out.println(i);
        }
    }
}