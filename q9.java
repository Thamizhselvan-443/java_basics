import java.util.Scanner;
class q9{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light : ");
        String color = scan.nextLine();
        if(color.equals("red")){
            System.out.println("stop");
        }
        else if(color.equals("yellow")){
            System.out.println("Get ready");
        }
        else if(color.equals("green")){
            System.out.print("you can go");
        }
    }
}