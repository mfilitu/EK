public class Main {
    public static void main(String[] args) {
        Election election = new Election();
        Candidate candidate = new Candidate("Mateusz", "Rep", 1200);
        Candidate candidate2 = new Candidate("mads", "Rep", 457);
        Candidate candidate3 = new Candidate("oscar", "Dem", 1800);
        Candidate candidate4 = new Candidate("peter", "Rep", 500);

        election.getCandidates().add(candidate);
        election.getCandidates().add(candidate2);
        election.getCandidates().add(candidate3);
        election.getCandidates().add(candidate4);

        System.out.println(election.getTotalVotes());

        System.out.println(election.getCandidatesFromParty("dem"));

    }
}
