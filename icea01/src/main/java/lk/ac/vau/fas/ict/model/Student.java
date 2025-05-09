package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends Person {

	@Id
	private String degree;
	
	@OneToMany(mappedBy = "student")
	private List<FoodOrder> foodOrders;
}
