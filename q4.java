import java.util.Scanner;
class q4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even"+" "+num);
        }
        else{
            System.out.print("The number is odd"+" "+num);
        }
    }
}