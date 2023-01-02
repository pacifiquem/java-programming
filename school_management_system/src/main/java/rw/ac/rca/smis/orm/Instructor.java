package rw.ac.rca.smis.orm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
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
@Table(name="instructor")
public class Instructor extends Person{

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private int id;
	private  String name;
	private Date dateOfBirth;
	private char gender;
	@ManyToOne
	private Address address;

	@OneToMany(mappedBy = "instructor")
	private List<Course> courses = new ArrayList<Course>();
	public Instructor() {}

	public Instructor(String name, Date dateOfBirth, char gender) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public char getGender() {
		return gender;
	}
	@Override
	public void setGender(char gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
