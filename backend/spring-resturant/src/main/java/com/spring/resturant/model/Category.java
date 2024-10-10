package com.spring.resturant.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends CategoryOrder{
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	
	private Set<Order> orders;
	

}
