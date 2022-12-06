package mpac.learning.java.models;

import javax.persistence.*;

@Entity
@Table(name = "vote")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    public Voter getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(Voter voter_id) {
        this.voter_id = voter_id;
    }

    @OneToOne
    @JoinColumn(name = "voter_id")
    private Voter voter_id;

    public Candidate getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(Candidate candidate_id) {
        this.candidate_id = candidate_id;
    }

    @OneToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate_id;

}
