
public class Teacher extends Person {
    
    private int salary;
    
    public Teacher(String name, String direction, int salary){
        super(name, direction);
        this.salary = salary;
    }
    
    public String toString(){
        return super.toString()+ "\n  salary " + salary + " euro/month";
    }
    
}
