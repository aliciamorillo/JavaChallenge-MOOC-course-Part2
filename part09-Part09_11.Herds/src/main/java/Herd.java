
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {
    
     private List<Movable> herdList;
     
     public Herd(){
         this.herdList = new ArrayList<>();
     }
    
    public String toString(){
        String newString = "";
        
        for(Movable obj: herdList){
            newString += obj.toString().trim() + "\n";
        }
        
        return newString;
    }
    
    public void addToHerd(Movable movable){
        herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable obj: herdList){
            obj.move(dx, dy);
        }
    }
    
}
