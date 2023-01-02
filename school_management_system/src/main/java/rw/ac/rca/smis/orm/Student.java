package rw.ac.rca.smis.orm;
import java.util.ArrayList;
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
public class Student extends  Person{
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private int id;
	private Date dateOfBirth;
	private char gender;
	private String name;
	@ManyToOne
	private Address address;
	@OneToMany(mappedBy = "student")
	private ArrayList<Mark> mark;

	@ManyToMany(mappedBy = "students")
	private ArrayList<Course> courses;
	public Student() {}

	public Student( String name, Date dateOfBirth, char gender) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public char getGender() {
		return gender;
	}
	@Override
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Mark> getMark() {
		return mark;
	}
	public void setMark(ArrayList<Mark> mark) {
		this.mark = mark;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}
