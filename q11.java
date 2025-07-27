//finding greatest amoung 2 numbers using ternary operation
import java.util.Scanner;
class q11{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value for a : ");
        int a = scan.nextInt();
        System.out.print("Enter the value for b : ");
        int b = scan.nextInt();
        String result = (a>b)?"a is greater":"b is greater";
        System.out.print(result);
    }
}