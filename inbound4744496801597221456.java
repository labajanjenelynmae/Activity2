 package Activity2;
import java.util.Scanner;

public class candymachine {

  static Scanner scan = new Scanner(System.in);
  
  public static double displayMenu(){

    double price = 0;
    System.out.println("Here's what I have:");
    System.out.println("A.   20.00    snowber");
    System.out.println("B.   80.00   coco crunch");
    System.out.println("C.   30.00    stick o ");
    
    System.out.println();
    System.out.println("Which candy would you like to purchase(letter only)?: ");
    
    System.out.println("B.   80.00 chocomucho");
    String choice = scan.next().toUpperCase();
    
    if (choice.equals("A")){
      System.out.println("You have selected dynamite");
      System.out.print("Price: ");
      price = 20.00;
      return price;
    }
    else if (choice.equals("B")){
      System.out.println("You have selected chocomucho");
      System.out.print("Price: ");
      price = 80.00;
      return price;
    }
    else if (choice.equals("C")){
      System.out.println("You have selected lollipop");
      System.out.print("Price: ");
      price = 30.00;
      return price;
    }
    else {
      return price;
    }
  }
  
  public static void dispense(double money, double candyPrice){
       
    if (money > candyPrice){
      System.out.println("Here''s your candy. Enjoy!");
      double change = money - candyPrice;
      System.out.println("Here's "+change+" in change");
    }
    else if (money == candyPrice){
      System.out.println("Here's your candy. Enjoy!");
    }
    else {
      System.out.println("You don't have enough money to purchase the item");
    }
   
  }
  
  public static void main(String[] args) {
   
     System.out.println("Welcome to the first ever Virtual Candy Vending Machine!!!");
     System.out.println();
     
     
     double candyPrice = displayMenu();
     System.out.println(candyPrice);
     
     if (candyPrice == 0){
       System.out.println("I don't have that item on my menu");
     }
     else {
       System.out.print("Please enter your money here: ");
       double money = scan.nextDouble();
       dispense(money, candyPrice);
       
     }
  }
}