
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstContainer); 
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add") && amount >= 0){
                firstContainer.add(amount);
            }
            
            if(command.equals("move")){
                if (amount <= 0 || firstContainer.contains() == 0) {
                    return;
                }
            
                if (firstContainer.contains() - amount < 0) {
                    amount = firstContainer.contains();
                }

                firstContainer.remove(amount);

                secondContainer.add(amount);
            }
            
            if(command.equals("remove")){
                secondContainer.remove(amount);
            }

        }
    }

}
