
import java.util.ArrayList;
import java.util.List;


public abstract class Pipe <T> implements List<T> {
    
    private List<T> pipeList;
    
    public Pipe(){
        this.pipeList = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipeList.add(value);
    }
    
    public T takeFromPipe(){
        if (pipeList.isEmpty()) {
            return null;
        }
        
        T value = pipeList.get(pipeList.size() - 1);
        return value;
    }
    
    public boolean isInPipe(){
        if(pipeList.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
    
}
