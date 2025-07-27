//loan eligiblity checking program with nested if statement
import java.util.Scanner;
class q10{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your salary : ");
        int salary = scan.nextInt();
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        int loan = 0;
        if(salary >= 20000 || age <= 25){
            System.out.print("Enter your required loan amount : ");
            loan = scan.nextInt();
            if(loan <= 50000){
                System.out.print("you are eligible for loan");
            }
            else{
                System.out.print("The maximum amount is 50000");
            }
        }
        else{
            System.out.print("you are not eligible for loan");
        }  
    }
}