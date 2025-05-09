package lk.ac.vau.fas.ict.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodOrder {

	@Id
	
	private Long id;
	private LocalDate orderDate;
}
