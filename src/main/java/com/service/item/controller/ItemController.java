package com.service.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.item.model.Item;
import com.service.item.service.ItemService;
@RestController
public class ItemController implements ItemInterface{
	
	@Autowired
	ItemService ItemService;


	@Override
	public List<Item> getItem( @PathVariable String itemname) {
		List<Item> Items=ItemService.getItemDatails(itemname);
		return Items;
	}

	@Override
	public List<Item> getItemDetails() {
		String itemname=null;
		List<Item> Items=ItemService.getItemDatails(itemname);
		return Items;
	}

}
