
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true){
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        double averagePos = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number > 0)
            .average().getAsDouble();
        
        double averageNeg = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number < 0)
            .average().getAsDouble();
        
        String negPos = scanner.nextLine();
        if(negPos.equals("p")){
            System.out.println("Average of the positive numbers: " + averagePos);
        } else if(negPos.equals("n")){
            System.out.println("Average of the negative numbers: " + averageNeg);
        }
                
    }
}
