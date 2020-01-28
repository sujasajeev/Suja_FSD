package com.cts.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.rest.model.ProductModel;

@RestController
public class DemoController {
	
	List<ProductModel> li=new ArrayList<>();
	Map<Integer,ProductModel> map= new HashMap<>();
	
	
	@RequestMapping("/data")
	public String Display()
	{
		
		return "hello world";
	}
	
	@RequestMapping("/product")
	public List getList(ProductModel productmodel)
	{
		li.add(new ProductModel(1001,"TV",4000,100));
		li.add(new ProductModel(1002,"AC",5000,200));
		li.add(new ProductModel(1003,"FAN",6000,300));
		return li;
		
	}
	
	
	
	
	@RequestMapping("/productmap")
	public Map getMap(ProductModel productmodel)
	{
		map.put(1001,new ProductModel(1001,"TV",4000,100));
		map.put(1002,new ProductModel(1002,"AC",5000,200));
		map.put(1003,new ProductModel(1003,"FAN",6000,300));
		return map;
		
	}
	
	
	
	@RequestMapping("/jsondata")
	public String Print()
	{
		return "this is json";
	}
	
	

}
