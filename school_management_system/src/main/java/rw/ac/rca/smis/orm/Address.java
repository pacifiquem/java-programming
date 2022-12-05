package rw.ac.rca.smis.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	public Address(String name, String streetAddress) {
		this.name = name;
		this.streetAddress = streetAddress;

	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	 private  int id;
	 private String name;
	 private String streetAddress;
	 
	 
	 public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "address")
	private Set<Student> student;
	 
	
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
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

	
}
