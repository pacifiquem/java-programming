package rw.ac.rca.smis.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mark")
public class Mark {
	 public Mark(Course course, Student student, int scoredMark) {
		this.course = course;
		this.student = student;
		this.scoredMark = scoredMark;
	}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private  Course course;
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private  Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	 
	private int scoredMark;
	public int getScoredMark() {
		return scoredMark;
	}
	public void setScoredMark(int scoredMark) {
		this.scoredMark = scoredMark;
	}
}
