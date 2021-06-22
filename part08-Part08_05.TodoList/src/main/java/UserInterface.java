
import java.util.Scanner;


public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                System.out.println("To add:");
                String inputAdd = scanner.nextLine();
                todoList.add(inputAdd);
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int removeInput = Integer.valueOf(scanner.nextLine());
                todoList.remove(removeInput);
            }
            
            if(command.equals("list")){
                todoList.print();
            }
        }
    
    }
    
}
