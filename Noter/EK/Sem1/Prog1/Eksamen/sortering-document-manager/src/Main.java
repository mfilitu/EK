import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Document CV = new Document("mit CV");
        Thread.sleep(1000);
        Document menu = new Document("nyt  menu");
        Thread.sleep(1000);

        Document todo = new Document("todo imorgen");
        Thread.sleep(1000);


        System.out.println(menu.titleKeyword("menu"));
        System.out.println(todo.titleKeyword("imorgen"));

        List<Document> documentList = new ArrayList<>();

        documentList.add(CV);
        documentList.add(todo);
        documentList.add(menu);

        Collections.sort(documentList, new documentComperator());

        for (Document document : documentList){
            System.out.println(document);
        }

    }
}
