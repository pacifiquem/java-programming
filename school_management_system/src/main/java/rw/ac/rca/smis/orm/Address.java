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
public class Address extends Person {
	public Address() {}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private  int id;
	private String name;
	private String streetAddress;

	public Address(String name, String streetAddress) {
		this.name = name;
		this.streetAddress = streetAddress;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

}
