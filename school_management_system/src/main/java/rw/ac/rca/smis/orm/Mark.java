package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="mark")
public class Mark {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int scoredMark;
	@ManyToOne
	private Student student;

	@ManyToOne
	private Course course;

	public Mark() {}
	public Mark( int scoredMark) {
		this.scoredMark = scoredMark;
	}

	public int getScoredMark() {
		return scoredMark;
	}

	public void setScoredMark(int scoredMark) {
		this.scoredMark = scoredMark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}

