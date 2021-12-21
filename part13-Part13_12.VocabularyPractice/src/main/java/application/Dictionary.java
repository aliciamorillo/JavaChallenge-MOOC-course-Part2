
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dictionary {
    
    private List<String> words;
    private Map<String, String> traslations;
    
    public Dictionary(){
        this.words = new ArrayList<>();
        this.traslations = new HashMap<>();
    }
    
    public String get(String word){
        return this.traslations.get(word);
    }
    
    public void add(String word, String traslation){
        if(!this.traslations.containsKey(word)){
            this.words.add(word);
        }
        this.traslations.put(word, traslation);
    }
    
    public String getRandomWord(){
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
    
}
