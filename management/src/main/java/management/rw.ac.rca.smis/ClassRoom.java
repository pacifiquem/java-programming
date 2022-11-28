package management.Entities;

public class ClassRoom {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }
    public ClassRoom(){};
    public ClassRoom(int id, String name, int studentsSize) {
        this.id = id;
        this.name = name;
        this.studentsSize = studentsSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentsSize(int studentsSize) {
        this.studentsSize = studentsSize;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudentsSize() {
        return studentsSize;
    }

    private int studentsSize;
}
