import java.util.*;

class TreeMapSet implements WordSet{
    private TreeMap<String,String> base;
    
    public TreeMapSet(){
        base = new TreeMap();
    }
    
    @Override
    public Word get(Word word){ 
        if(!base.containsKey(word.getWord())){
            return null;
        }
         return new Word(base.ceilingKey(word.getWord()),base.get(base.ceilingKey(word.getWord())));
        
    }

    
    @Override
    public void add(Word wordObject){
      base.put(wordObject.getWord(), wordObject.getType());
    }

}

/*referencia: https://code.google.com/p/hoja-de-trabajo-7-cf/source/browse/?r=7*/