import java.util.Comparator;

public class documentComperator implements Comparator<Document> {

    @Override
    public int compare(Document o1, Document o2) {
        return o1.getLastEdited().compareTo(o2.getLastEdited());
    }
}
