package rw.ac.rca.smis.orm;

import javax.persistence.*;

@Entity
@Table (name = "class_room")
public class ClassRoom
{
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeOfStudents() {
        return sizeOfStudents;
    }

    public void setSizeOfStudents(int sizeOfStudents) {
        this.sizeOfStudents = sizeOfStudents;
    }

    private int sizeOfStudents;
}
