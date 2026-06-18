public class Candidate {
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes){
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String getParty(){
        return party;
    }

    public int getNumberOfVotes(){
        return numberOfVotes;
    }

    public String toString(){
        return String.format("name: %s, party: %s, votes: %s\n", name, getParty(), getNumberOfVotes());
    }

}
