package com.service.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.item.dao.ItemDao;
import com.service.item.model.Item;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemDao ItemDao;

	@Override
	public List<Item> getItemDatails(String itemname) {
		
		List<Item> items=null;
		if(itemname!=null) {
			 items= ItemDao.getItem(itemname);
		}else {
			 items= ItemDao.getItemDetails();
		}
		
		return items;
	}

}
