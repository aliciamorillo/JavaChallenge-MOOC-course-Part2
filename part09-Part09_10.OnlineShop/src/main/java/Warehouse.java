
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    
    private Map<String, Integer> pricesMap;
    private Map<String, Integer> stockMap;
    
    public Warehouse(){
        this.pricesMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        pricesMap.put(product, price);
        stockMap.put(product, stock);
    }
    
    public int price(String product){
        return pricesMap.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stockMap.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.stock(product) > 0){
            stockMap.put(product, stockMap.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> productNameSet = new HashSet<>();
        for(String key: pricesMap.keySet()){
            productNameSet.add(key);
        }
        
        return productNameSet;
    }
}
