package com.service.item.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.item.model.Item;

@Repository
public interface ItemDao extends CrudRepository<Item, Integer>{
	
	@Query("select item from Item item where item.name=?1")
	List<Item> getItem(String itemname);
	
	@Query("select item from Item item")
	List<Item> getItemDetails();
}
