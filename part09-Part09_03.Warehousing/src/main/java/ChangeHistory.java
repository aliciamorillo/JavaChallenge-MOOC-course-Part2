
import java.util.ArrayList;


public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        double max = this.history.get(0);
        for (Double d : this.history) {
            if (max < d) {
                max = d;
            }
        }
        return max;
    }
    
    public double minValue(){
        double min = this.history.get(0);
        for (Double d : this.history) {
            if (min > d) {
                min = d;
            }
        }
        return min;
    }
    
    public double average(){
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        
        for(Double change: history){
            sum += change; 
        }
        return sum / history.size();
    }
    
}
