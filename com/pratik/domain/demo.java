package com.pratik.domain;

public class demo 
{
	private int pid;
	private String pname;
	private float p_price;
	private int p_quantity;
	
	
public demo() {
	System.out.println("YOU ARE IN  GETTER SETTER==\n\n");
}


public int getPid() {
	return pid;
}


public void setPid(int pid) {
	this.pid = pid;
}


public String getPname() {
	return pname;
}


public void setPname(String pname) {
	this.pname = pname;
}


public float getP_price() {
	return p_price;
}


public void setP_price(float p_price) {
	this.p_price = p_price;
}


public int getP_quantity() {
	return p_quantity;
}


public void setP_quantity(int p_quantity) {
	this.p_quantity = p_quantity;
}


@Override
public String toString() {
	return "demo [pid=" + pid + ", pname=" + pname + ", p_price=" + p_price + ", p_quantity=" + p_quantity + "]";
}



}
