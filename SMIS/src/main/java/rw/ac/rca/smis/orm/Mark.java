package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.*;

@Entity
@Table (name = "mark_table")
public class Mark {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mark_id",nullable = false)
    private int id;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "Mark"
    )
    private Course course;
    private int score;

    public Mark() {
    }

    public Mark(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course courseList) {
        this.course = course;
    }

}
