package com.neuedu.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Order;
@Mapper
public interface OrderMapper {
	/*
	 * 增加
	 * */
	public int addOrder(Order order);
	/*
	 * 删除
	 * */
	public int deleteOrder(Integer oid);
	/*
	 * 修改
	 * */
	public int editOrder(Order order);
	/*
	 * 查询
	 * */
	public List<Order> queryAllOrder();
	/*
	 * id查询
	 * */
	public Order getOrderById(Integer oid);
	
 
	
}
