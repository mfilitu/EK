import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messageList = new ArrayList<>();

        Message mes1 = new Message("Mateusz", "Hej jeg bliver hjemme i dag");
        Message mes2 = new Message("Boss", "Okay mateusz, god bedring i dag ses.");
        Message mes3 = new Message("Mateusz", "Tak vi ses på mandag");

        messageList.add(mes1);
        messageList.add(mes2);
        messageList.add(mes3);

        System.out.println(mes1.containsWord("hjemme"));

        System.out.println(searchMessagesForWord(messageList, "på"));

    }

    private static Message searchMessagesForWord(List<Message> messageList, String word) {
        for (Message message : messageList){
            if (message.containsWord(word)){
                return message;
            }
        }
        return null;
    }
}
