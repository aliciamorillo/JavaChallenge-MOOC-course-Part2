
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storageHashmap;
    
    public StorageFacility(){
        this.storageHashmap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storageHashmap.putIfAbsent(unit, new ArrayList<>());
        this.storageHashmap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> newContent = new ArrayList<>();
        return this.storageHashmap.getOrDefault(storageUnit, newContent);
    }
    
    public void remove(String storageUnit, String item){
        this.storageHashmap.get(storageUnit).remove(item);
        
        if(this.storageHashmap.get(storageUnit).isEmpty()){
            this.storageHashmap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> newStorage = new ArrayList<>();
        
        for(String e: storageHashmap.keySet()){
            newStorage.add(e);
        }
        
        return newStorage;
    }
}
