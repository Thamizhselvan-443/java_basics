import java.util.Scanner;
class q8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter mark1");
        int m1 = scan.nextInt();
        System.out.println("enter mark2");
        int m2 = scan.nextInt();
        System.out.println("enter mark3");
        int m3 = scan.nextInt();
        System.out.println("enter mark4");
        int m4 = scan.nextInt();
        System.out.println("enter mark5");
        int m5 = scan.nextInt();
        int add = m1+m2+m3+m4+m5;
        int avg = add/5;
        if(avg < 35){
            System.out.println("Need additional class");
        }
        else{
            System.out.print("You are good to go");
        }
    }
}