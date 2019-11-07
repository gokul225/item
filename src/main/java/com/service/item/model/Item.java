package com.service.item.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;



@Table(name="item")
@Entity
public class Item {
	
	@Id	
	@Column(name="id",unique=true)
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
	@Column(name="name")
	private String name;
	
	@JsonProperty("description")
	@Column(name="description")
	private String description;
	
	@JsonProperty("price")
	@Column(name="price")
	private Long price;
	
	
	
	
}
