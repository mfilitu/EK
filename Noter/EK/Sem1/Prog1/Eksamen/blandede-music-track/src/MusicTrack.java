public class MusicTrack {
    private String title;
    private int durationInSeconds;

    public MusicTrack(String title, int durationInSeconds){
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds(){
        return durationInSeconds;
    }

    public boolean isLongTrack(){
        return getDurationInSeconds() > 300;
    }

    public String toString(){
        return String.format("Title: %s, duration: %s", title, getDurationInSeconds());
    }
}
