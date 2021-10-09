
import java.util.ArrayList;


public class MisplacingBox extends Box {
    
    private ArrayList<Item> misplacingBoxList;
    
    public MisplacingBox(){
        this.misplacingBoxList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingBoxList.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
