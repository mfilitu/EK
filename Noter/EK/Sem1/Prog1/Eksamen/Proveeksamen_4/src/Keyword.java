import java.util.ArrayList;
import java.util.List;

public class Keyword {
    private String word;
    private String definition;
    private List<Keyword> seeAlso;

    public Keyword(String word, String definition){
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>();
    }

    public boolean matches(String search){
        if (search.equalsIgnoreCase(getWord())){
            return true;
        } else return false;
    }

    public void addToSeeAlso(Keyword keyword){
        seeAlso.add(keyword);
    }

    public List<Keyword> seeAlso(){
        return seeAlso;
    }

    public String getWord(){
        return word;
    }

    public String getDefinition(){
        return definition;
    }

    public String toString(){
        return String.format("Word: %s\nDefinition: %s", getWord(), getDefinition());
    }
}
