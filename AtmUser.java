package Encapsulation;
import java.util.Scanner;

public class AtmUser {
      public static void main(String[]args) {
    	  Scanner s=new Scanner(System.in);
    	  Atm1 user1=new Atm1(10000,1234);
    	  System.out.println("Enter the pin");
    	  int pin=s.nextInt();
    	  user1.setMoney(5000, pin);
    	  System.out.println(user1.getMoney(pin));
    	  
    	  
      }
}
