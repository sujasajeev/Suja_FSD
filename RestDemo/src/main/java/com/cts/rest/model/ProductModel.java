package com.cts.rest.model;

//import org.springframework.web.bind.annotation.RestController;

public class ProductModel {
	
private int pId;
private String pName;
private int pPrice;
private int pQuantity;


public ProductModel()
{
	System.out.println("obj created");
}

public ProductModel(int pId, String pName, int pPrice, int pQuantity) {
	
	this.pId = pId;
	this.pName = pName;
	this.pPrice = pPrice;
	this.pQuantity = pQuantity;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public float getpPrice() {
	return pPrice;
}
public void setpPrice(int pPrice) {
	this.pPrice = pPrice;
}
public int getpQuantity() {
	return pQuantity;
}
public void setpQuantity(int pQuantity) {
	this.pQuantity = pQuantity;
}

 



}
