import java.util.Scanner;
class q2{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int salary = scan.nextInt();

        if (salary>7000){
            System.out.println("eligible for scholarship");
        
        }
        else{
            System.out.print("Not eligible for scholarship");
        }

    }
}