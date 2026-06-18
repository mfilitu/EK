import java.time.LocalDateTime;

public class Document {
    private String title;
    private LocalDateTime lastEdited;

    public Document(String title) {
        this.title = title;
        this.lastEdited = LocalDateTime.now();
    }

    public boolean titleKeyword(String keyword) {
        if (this.title.contains(keyword)) {
            return true;
        } else return false;
    }

    public LocalDateTime getLastEdited(){
        return lastEdited.withSecond(59);
    }

    public String toString(){
        return String.format("Document name: %s", this.title);
    }
}
