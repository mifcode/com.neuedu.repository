package com.neuedu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.domain.Order;
import com.neuedu.demo.mapper.OrderMapper;
 
public interface OrderService {
	
	public void addOrder(Order order) ;
	
	public void deleteOrder(Integer oid) ;
	
	public List<Order> queryAllOrder();
	
	public void editOrder(Order order) ;

	public Order getOrderById(Integer oid);

 
}
