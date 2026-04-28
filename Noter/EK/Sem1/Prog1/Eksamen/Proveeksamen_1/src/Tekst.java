import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tekst {
    private ArrayList<String> tekstLinjer;

    public Tekst(){
        tekstLinjer = new ArrayList<>();
    }

    public void tilføj(String text){
        tekstLinjer.add(text);
    }

    public String toString(){
        return tekstLinjer.toString();
    }

    public ArrayList<String> getTekstLinjer(){
        return tekstLinjer;
    }

    public int findAntalUnikke() {
        ArrayList<String> unikke = new ArrayList<>();
        for (String linje : tekstLinjer) {
            if (!unikke.contains(linje)){
                unikke.add(linje);
            }

        }

        return unikke.size();
    }

    public int findAntalUikke(ArrayList<String> text){
        int count = 0;
        for(int i = 0; i < text.size(); i++){
            for (int j = i+1; j < text.size(); j++){
                if (text.get(i) != text.get(j)){
                    System.out.println(text.get(i) + text.get(j));
                    //text.remove(j);
                    count ++;
                }
            }
        }
        return count;
    }


}
