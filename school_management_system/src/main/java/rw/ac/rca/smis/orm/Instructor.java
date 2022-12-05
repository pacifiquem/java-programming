package rw.ac.rca.smis.orm;
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

//import java.utils*;
@Entity
@Table(name="instructor")
public class Instructor {
	public Instructor(String name, Date dateOfBirth, char gender) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	 private int id;
	  private  String name;
	  private Date dateOfBirth;
	  private char gender;
	  
	  @ManyToOne
	  @JoinColumn(name = "address_id")
	  private  Address address;
	  
	  @ManyToMany
	  @JoinTable(name = "instructor_course", joinColumns = { @JoinColumn(name = "instructor_id") }, inverseJoinColumns = { @JoinColumn(name = "course_id") })
	  private  List <Course> courses;
	  
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
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
 
   

}
