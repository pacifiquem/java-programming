package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="course")
public class Course extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	int id;

	@ManyToMany(mappedBy = "course")
    private ArrayList<Mark> mark;
	private String name;
	private double neatMark;
	private int period;


	public Course() {}

	public Course(Instructor instructor, int period, String name, double neatMark) {
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

	public ArrayList<Mark> getMark() {
		return mark;
	}

	public void setMark(ArrayList<Mark> mark) {
		this.mark = mark;
	}

}
