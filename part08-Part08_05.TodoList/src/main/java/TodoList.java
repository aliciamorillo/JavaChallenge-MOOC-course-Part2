
import java.util.ArrayList;


public class TodoList {
    
    private ArrayList<String> todos;
    
    public TodoList(){
        this.todos = new ArrayList();
    }
    
    public void add(String task){
        todos.add(task);
    }
    
    public void print(){
        int num = 0;
        for(String i: todos){
            num++;
            System.out.println(num + ": " + i);
        }
    }
    
    public void remove(int number){
        if(number > 0){
            todos.remove(number-1);
        }
    }
    
}
