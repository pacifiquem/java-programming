package management.Entities;

public class Mack {
    private int id;
    private Course course;
    private double scoredMac;
    private Student student;

    public Mack(int id, Course course, double scoredMac, Student student) {
        this.id = id;
        this.course = course;
        this.scoredMac = scoredMac;
        this.student = student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setScoredMac(double scoredMac) {
        this.scoredMac = scoredMac;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public double getScoredMac() {
        return scoredMac;
    }

    public Student getStudent() {
        return student;
    }
}
