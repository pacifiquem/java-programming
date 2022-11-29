package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "instructor_table")
public class Instructor
{
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "instructor_id",nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Instructor() {
    }

    public Instructor(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    private int regId;
    private String name;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "courses_course_id")
    private Course courses;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
