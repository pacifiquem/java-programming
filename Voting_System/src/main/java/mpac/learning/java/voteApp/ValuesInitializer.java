package mpac.learning.java.voteApp;

import mpac.learning.java.models.Candidate;
import mpac.learning.java.models.Vote;
import mpac.learning.java.models.Voter;

import java.util.Scanner;

public class ValuesInitializer {

    private Scanner sc = new Scanner(System.in);

    public Candidate addCandiate() {

        System.out.println("Enter Candidate Name: ");
        String candidateName = sc.nextLine();

        System.out.println("Enter Candidate's party: ");
        String candidateParty = sc.nextLine();

        Candidate newCandite = new Candidate(candidateName, candidateParty);
        return newCandite;

    }

    public Voter voteCandidate() {
        System.out.println("Enter your name: ");
        String voterName = sc.nextLine();

        System.out.println("Enter your location: ");
        String voterLocation = sc.nextLine();

        System.out.println("Enter your candidates's Id: ");
        int candidate_id = sc.nextInt();

        Candidate candidate = new Candidate();

        Voter newVoter = new Voter(voterName, voterLocation);
        newVoter.setCandidate_id(candidate);

        Vote newVote = new Vote();
        newVote.setVoter_id(newVoter);
        newVote.setCandidate_id(candidate);

        return newVoter;
    }
}
