
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    
    private Map<String, Item> itemsMap;
    
    public ShoppingCart(){
        this.itemsMap = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(itemsMap.keySet().contains(product)){
            increaseQuantity(product);
        } else{
            itemsMap.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int sum = 0;
        
        for(Item e: itemsMap.values()){
            sum += e.price();
        }
        
        return sum;
    }
    
    public void print(){
        for(String e: itemsMap.keySet()){
            System.out.println(itemsMap.get(e).toString());
        }
    }
    
    public void increaseQuantity(String product){
         this.itemsMap.get(product).increaseQuantity();
    }
}
