
public class Student extends Person {
    
    private int credits;
    
    public Student(String name, String direction){
        super(name, direction);
    }
    
    public void study(){
        credits++;
    }
    
    public int credits(){
        return credits;
    }
    
    public String toString(){
        return super.toString() + "\n  Study credits " + credits;
    }
}
