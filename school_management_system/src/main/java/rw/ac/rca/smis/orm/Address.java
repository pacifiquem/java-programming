package rw.ac.rca.smis.orm;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	public Address() {}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private  int id;
	private String name;
	private String streetAddress;

	@OneToMany(mappedBy = "address")
	private ArrayList<Instructor> instructors = new ArrayList<Instructor>();

	@OneToMany(mappedBy = "address")
	private ArrayList<Student> students = new ArrayList<Student>();

	public Address(String name, String streetAddress) {
		this.name = name;
		this.streetAddress = streetAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(ArrayList<Instructor> instructors) {
		this.instructors = instructors;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
