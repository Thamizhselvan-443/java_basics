import java.util.Scanner;
class demo{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>=35){
            System.out.println("You have passed");
        }
        else{
            System.out.println("You have failed");
        }
    }
}