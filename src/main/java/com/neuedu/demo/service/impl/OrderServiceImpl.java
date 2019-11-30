package com.neuedu.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.domain.Order;
import com.neuedu.demo.mapper.OrderMapper;
import com.neuedu.demo.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderMapper orderMapper;

	@Override
	public void addOrder(Order order) {
		orderMapper.addOrder(order);
	}

	@Override
	public void deleteOrder(Integer oid) {
		orderMapper.deleteOrder(oid);
	}

	@Override
	public List<Order> queryAllOrder() {
		return orderMapper.queryAllOrder();
	}

	@Override
	public void editOrder(Order order) {
		orderMapper.editOrder(order);
	}

	@Override
	public Order getOrderById(Integer oid) {
		return orderMapper.getOrderById(oid);
	}

	 
	
	
}
