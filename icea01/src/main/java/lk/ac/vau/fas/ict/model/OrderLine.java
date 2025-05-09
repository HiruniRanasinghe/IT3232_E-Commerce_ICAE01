package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderLine {

	@Id
	private Long id;
	private int quantity;
	
}
