
import java.util.ArrayList;


public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable itemToPack){
        if(this.weight() + itemToPack.weight() <= maxCapacity){
            items.add(itemToPack);
        }
    }

    @Override
    public double weight() {
        double sum = 0;
        
        for(Packable item: items){
            sum += item.weight();
        }
        
        return (double) sum;
    }
    
    @Override
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
