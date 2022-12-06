package mpac.learning.java.models;


import javax.persistence.*;

@Entity
@Table(name = "voter")
public class Voter {

    public int getVoter_id() {
        return voter_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE )
    private int voter_id;

    public Candidate getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(Candidate candidate_id) {
        this.candidate_id = candidate_id;
    }

    @OneToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate_id;

    public Voter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    public Voter(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
