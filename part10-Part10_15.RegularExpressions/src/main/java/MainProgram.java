
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker testChecker = new Checker();
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        if(testChecker.allVowels(input)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
