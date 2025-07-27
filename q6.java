import java.util.Scanner;
class q6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the shop name : ");
        String shop = scan.nextLine();
        System.out.print("Enter the food : ");
        String food = scan.nextLine();

        if(shop.equals("KFC")){
            System.out.println("I Entered KFC");
            if(food.equals("chicken")){
                System.out.println("I will eat");
                if(food.equals("chicken")){
                    System.out.print("I will drink pepsi");
                }
            }
        }
    }
}
