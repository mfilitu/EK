public class Message {
    private String sender;
    private String content;

    public Message(String sender, String content){
        this.sender = sender;
        this.content = content;
    }

    public boolean containsWord(String word){
        return content.contains(word);
    }


    public String toString(){
        return String.format("%s\n%s", sender, content);
    }
}
