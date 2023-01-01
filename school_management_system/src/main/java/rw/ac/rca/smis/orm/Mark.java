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

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int scoredMark;
	@ManyToOne
	private Student student;

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

}
