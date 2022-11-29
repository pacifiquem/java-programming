package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "course")
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    private Long id;


    @OneToMany
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "Course"
    )
    private Mark mark;

    private String name;

    int period;
    double passMark;

    public Course() {
    }

    public Course(String name, int period, int passMark) {
        this.name = name;
        this.period = period;
        this.passMark = passMark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

}
