package com.pratik.DAO;

public class DAO_Factory {
	public static DAO_Interface getInstance() {
	return new DAO_IMPL();
	}
}
