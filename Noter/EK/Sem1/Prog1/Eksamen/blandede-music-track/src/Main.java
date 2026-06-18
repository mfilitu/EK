import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MusicTrack song = new MusicTrack("Song", 280);
        MusicTrack song2 = new MusicTrack("Song2", 300);
        MusicTrack song3 = new MusicTrack("Song3", 455);
        MusicTrack song4 = new MusicTrack("Song4", 255);
        MusicTrack song5 = new MusicTrack("Song5", 398);
        MusicTrack song6 = new MusicTrack("Song6", 300);
        MusicTrack song7 = new MusicTrack("Song7", 150);

        ArrayList<MusicTrack> musicTracks = new ArrayList<>();

        musicTracks.add(song);
        musicTracks.add(song2);
        musicTracks.add(song3);
        musicTracks.add(song4);
        musicTracks.add(song5);
        musicTracks.add(song6);
        musicTracks.add(song7);

        System.out.println(averageDuration(musicTracks));
    }

    private static double averageDuration(ArrayList<MusicTrack> musicTracks) {
        double average = 0;
        for (MusicTrack song : musicTracks){
            average += (double) song.getDurationInSeconds()/ musicTracks.size();
        }
        return average;
    }
}
