package rw.ac.rca.smis;

import java.util.*;

public class Student {
    private int id;
    private String studentName;
    private Address address;
    private ClassRoom classRoom;
    public  Student(){}
    public Student(int id, String studentName, Address address, ClassRoom classRoom, List<Course> courses) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
        this.classRoom = classRoom;
        this.courses = courses;
    }
    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public List<Course> getCourses() {
        return courses;
    }



    private List<Course> courses;

}
