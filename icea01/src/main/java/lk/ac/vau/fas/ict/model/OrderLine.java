package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {

	@Id
	private Long id;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "food_order_id")
	private FoodItem foodItem;
}
