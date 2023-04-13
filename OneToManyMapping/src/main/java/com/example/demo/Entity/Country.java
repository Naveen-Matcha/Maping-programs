package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data

@Table(name = "country")
public class Country {

	@Id
	// @GeneratedValue(strategy = IDENTITY)
	@Column(name = "c_id")
	private int cid;

	@OneToMany(targetEntity = State.class, cascade = CascadeType.ALL)
	private List<State> state;

	@Column(name = "name")
	private String name;

	

}
