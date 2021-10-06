
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionaryTraslationHM;
    
    public DictionaryOfManyTranslations(){
        this.dictionaryTraslationHM = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.dictionaryTraslationHM.putIfAbsent(word, new ArrayList<>());
        this.dictionaryTraslationHM.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> newList = new ArrayList<>();
        
        return this.dictionaryTraslationHM.getOrDefault(word, newList);
    }
    
    public void remove(String word){
        this.dictionaryTraslationHM.remove(word);
    }
}
