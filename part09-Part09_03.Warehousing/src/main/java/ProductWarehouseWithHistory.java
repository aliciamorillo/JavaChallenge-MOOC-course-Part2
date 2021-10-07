
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    
    public String history(){
        return changeHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }
 
    @Override
    public double takeFromWarehouse(double amount) {
        double received = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return received;
    }
}
