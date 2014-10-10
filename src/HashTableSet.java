
import java.util.*;
/**
 *
 * @author andreabarrera
 */
public class HashTableSet implements WordSet{
    private HashMap<String,String> base;
    
    public HashTableSet(){
        base = new HashMap();
    }
    
     @Override
    public Word get(Word word){ 
        if(!base.containsKey(word.getWord())){
            return null;
        }
         return new Word(word.getWord(),base.get(word.getWord()));
        
    }
    
    @Override
    public void add(Word wordObject){
      base.put(wordObject.getWord(), wordObject.getType());
    }
}

/*referencia: https://code.google.com/p/hoja-de-trabajo-7-cf/source/browse/?r=7*/