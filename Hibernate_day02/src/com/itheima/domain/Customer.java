package com.itheima.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private Integer id;
	private String name;
	private Set<Order> orders = new HashSet<Order>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	

}
