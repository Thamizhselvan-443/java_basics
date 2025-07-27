import java.util.Scanner;
class q5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int score = scan.nextInt();
        if(score > 35 && score<60){
            System.out.println("I will bought you a video game");
        }
        else if (score > 60 && score < 90){
            System.out.println("I will bought you a i phone");
        }
        else if(score >=90){
            System.out.print("I will bought you a Macbook pro");
        }
        else{
            System.out.print("Nothing");
        }
           
        }
}