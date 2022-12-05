package rw.ac.rca.smis.orm;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course { 
	private int period;
	
	public Course(Instructor instructor, int period,  String name,
			double neatMark) {
		this.period = period;
		this.name = name;
		this.neatMark = neatMark;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int id;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private Set<Instructor> instructors;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Student.class)
	private Set<Mark>marks;

	public Set<Mark> getMarks() {
		return marks;
	}
	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}


	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private Set<Student> students;
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Column
	public Set<Instructor> getInstructors() {
		return instructors;
	}
	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}
	
	
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	
	private double neatMark;
	
	public double getNeatMark() {
		return neatMark;
	}
	public void setNeatMark(double neatMark) {
		this.neatMark = neatMark;
	}
	

}
