package rw.ac.rca.smis.orm;
import java.util.Date;
import java.util.List;
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
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date dateOfBirth;
	private char gender;
	private String name;
	
	@ManyToOne
	private  Address address;
    @ManyToMany
    @JoinTable(name = "student_course", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = { @JoinColumn(name = "course_id") })
	private Set<Course> courses;
	
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
	private Set<Mark> marks;
	
	public Student( Course course,String name, Date dateOfBirth, char gender,
			Address address) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
	}


	
	public Set<Mark> getMarks() {
		return marks;
	}
	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}


	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
		
	
}
