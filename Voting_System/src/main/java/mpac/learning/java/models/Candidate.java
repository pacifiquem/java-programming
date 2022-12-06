package mpac.learning.java.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int candidate_id;

    public Candidate() {
    }

    public Candidate(int candidate_id) {
        this.candidate_id = candidate_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    private String party;
//
//    @OneToMany
//    @JoinColumn(name = "voter_id")
//    private Set<Voter> voter_id;

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
    }

}
