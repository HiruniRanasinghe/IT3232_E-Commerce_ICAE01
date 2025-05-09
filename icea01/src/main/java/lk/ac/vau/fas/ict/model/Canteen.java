package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Canteen {

	@Id
	private Long id;
	private String name;
	private String location;
	
	@ManyToMany(mappedBy="canteens")
	private List<Employee> employees;
}
