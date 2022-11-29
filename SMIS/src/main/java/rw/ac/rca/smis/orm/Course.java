package rw.ac.rca.smis.orm;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    int period;
    double passMark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
