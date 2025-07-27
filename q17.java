// program to create a integer array ,get input for 5 numbers and print their sum
import java.util.Scanner;
class q17{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[5];
    int sum = 0;
    System.out.print("Enter the value of 1st number");
    for (int i=0;i<5;i++){
        arr[i] = scan.nextInt();
        sum = sum + arr[i];
        System.out.println("Enter the value of next number");
    }
    System.out.print("The sum of all number in array is : "+sum);
    }

}