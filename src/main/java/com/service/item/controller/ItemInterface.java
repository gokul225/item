package com.service.item.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.item.model.Item;

public interface ItemInterface {
	//@GetMapping("/Items/{itemname}")
	@RequestMapping(value = "/Items/{itemname}", method = RequestMethod.GET)
	List<Item> getItem(@PathVariable(value="itemname",required=false) String itemname);
	
	@RequestMapping(value = "/Items", method = RequestMethod.GET)
	List<Item> getItemDetails();
}
