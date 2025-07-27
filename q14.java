//program to print even and odd numbers between 1-10 using for and if-else statement and also counting number of odds in it
import java.util.Scanner;
class q14{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b : ");
        int b = scan.nextInt();
        int oddcount= 0;
        for (int i=a;i<=b;i+=1){
            if (i%2==0){
                 System.out.println("even number is : "+i);
            }
            else{
                
                oddcount = oddcount+1;
              
                System.out.println("odd number is : "+i);
            }  
        }
        System.out.println("the total number of odd numbers is : "+ oddcount);

    }
}