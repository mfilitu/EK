import java.util.ArrayList;
import java.util.Locale;

public class Election {
    private ArrayList<Candidate> candidates;

    public Election() {
        this.candidates = new ArrayList<>();
    }

    public ArrayList<Candidate> getCandidates(){
        return candidates;
    }

    public int getTotalVotes() {
        int numOfVotes = 0;
        for (Candidate candidate : candidates) {
            numOfVotes += candidate.getNumberOfVotes();
        }
        return numOfVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equalsIgnoreCase(party)){
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }
}
