import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Article {
    public String heading;
    public String body;
    public String author;

    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord(){
        String[] words = body.split("[,\\.\\s]");
        String longestWord = "";

        for (String word : words){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

    public List<String> getWords(){
        String[] words = body.split("[,\\.\\s]");

        Set<String> unique = new HashSet<>();

        for (String word : words){
            if (!word.isEmpty()){
                unique.add(word);
            }

        }
        return new ArrayList<>(unique);
    }

}
