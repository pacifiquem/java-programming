package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="course")
public class Course extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	int id;

	@OneToMany(mappedBy = "course")
    private List<Mark> mark;
	private String name;
	private double neatMark;
	private int period;


	@ManyToOne
	private Instructor instructor;

	@ManyToMany
	private List<Student> students = new ArrayList<Student>();

	public Course() {}

	public Course(int period, String name, double neatMark) {
		this.period = period;
		this.name = name;
		this.neatMark = neatMark;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public double getNeatMark() {
		return neatMark;
	}

	public void setNeatMark(double neatMark) {
		this.neatMark = neatMark;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public List<Mark> getMark() {
		return mark;
	}

	public void setMark(ArrayList<Mark> mark) {
		this.mark = mark;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
