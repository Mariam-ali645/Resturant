package com.spring.resturant.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//id
//name 
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryOrder extends Base{
	
	private String name ;
	
	@CreationTimestamp
	private  Date createData;
	@UpdateTimestamp
	private Date updateData;
	
	
	

}
