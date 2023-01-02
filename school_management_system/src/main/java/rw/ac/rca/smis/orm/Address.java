package rw.ac.rca.smis.orm;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Address {
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

}
