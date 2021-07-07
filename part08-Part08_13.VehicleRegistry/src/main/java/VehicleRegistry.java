
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> licensePlateHashMap;
    
    public VehicleRegistry(){
        this.licensePlateHashMap = new HashMap<>();
    }
        
    public boolean add(LicensePlate licensePlate, String owner){
        
        for(LicensePlate license: licensePlateHashMap.keySet()){
            if(license.equals(licensePlate)){
                return false;
            } 
        }
        licensePlateHashMap.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return licensePlateHashMap.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        
        if(!licensePlateHashMap.containsKey(licensePlate)){
            return false;
        }
        
        licensePlateHashMap.remove(licensePlate);
        
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate e: licensePlateHashMap.keySet()){
            System.out.println(e);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        
        for(String e: licensePlateHashMap.values()){
            if(!owners.contains(e)){
                owners.add(e);
            }
        }
        
        for(String e: owners){
            System.out.println(e);
        }
    }
    
}
