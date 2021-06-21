
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100"); 
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add") && amount >= 0){
                if(firstContainer < 100){
                    firstContainer += amount;
                }
                
                if(firstContainer > 100){
                    firstContainer = 100;
                }
            }
            
            if(command.equals("move")){
                if(firstContainer - amount < 0){
                    amount = firstContainer;
                }
                
                if(amount >= 100){
                    firstContainer = 0;
                    secondContainer = 100;
                
                } else if(secondContainer + amount <= 100){
                    secondContainer += amount;
                    firstContainer -= amount;
                
                } else if(amount + secondContainer > 100 && amount + firstContainer > 100){
                    firstContainer = 0;
                    secondContainer = 100;
                }
            }
            
            if(command.equals("remove")){
                if(amount > secondContainer){
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }

        }
    }

}
