package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "address")
public class Address {

        @Id()
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "address_id",nullable = false)
        private int id;

        private String placeName;
        private String coordinates;

    public Address() {
    }

    public Address(String placeName, String coordinates) {
        this.placeName = placeName;
        this.coordinates = coordinates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "address")
        private Student students;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "address")
    private Set<Instructor> instructors;
}
