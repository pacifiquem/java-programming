package management.Entities;

public class Course {
    private int id;
    private String name;
    private Instructor instructor;
    private int period;
    private double maxMark;

//    public  Course
    public Course(int id, String name, Instructor instructor, int period, double maxMark, ClassRoom classRoom) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.period = period;
        this.maxMark = maxMark;
        this.classRoom = classRoom;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setMaxMark(double maxMark) {
        this.maxMark = maxMark;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public int getPeriod() {
        return period;
    }

    public double getMaxMark() {
        return maxMark;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    private ClassRoom classRoom;

}
