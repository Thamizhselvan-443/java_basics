//program to print the numbers which are divisible by both 3 and 5 ranging from 1 - 100
import java.util.Scanner;
class q15{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("These are the numbers which are divisible by both 3 and 5 : ");
        for(int i = 1; i <= 100; i+=1){           
            if(i%3==0 && i%5 ==0){
                System.out.print(i+",");
            }
        }
    }
}