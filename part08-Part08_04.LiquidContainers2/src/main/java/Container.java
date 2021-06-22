
public class Container {
    
    private int amountLiquid;
    
    public Container(){
        this.amountLiquid = 0;
    }
    
    public int contains(){
        return amountLiquid;
    }
    
    public void add(int amount){
        if(amount < 0){
            return;
        }
        
        if(amount + amountLiquid >= 100){
            amountLiquid = 100;
        } else {
            amountLiquid += amount;
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        
        if(amountLiquid - amount <= 0){
            amountLiquid = 0;
        } else {
            amountLiquid -= amount;
        }
    }
    
    public String toString(){
        return amountLiquid + "/100";
    }
    
}
