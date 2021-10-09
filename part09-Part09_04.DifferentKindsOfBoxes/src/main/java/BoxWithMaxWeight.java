
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> itemsInMaxBox;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.itemsInMaxBox = new ArrayList<>();
    }
    
    public int currentAmount(){
        int sum = 0;
        
        for(Item e: itemsInMaxBox){
            sum += e.getWeight();
        }
        
        return sum;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return itemsInMaxBox.contains(item);
    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity) {
            itemsInMaxBox.add(item);
        }
    }
}
