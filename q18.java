// program to print 10 numbers from an array using for loop
import java.util.Scanner;
class q18{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0;i<10;i+=1){
            arr[i] = scan.nextInt();
            // System.out.println(i);
        }
        for(int i = 0;i<10;i+=1){
            System.out.println(i);
        }
        
    }
}