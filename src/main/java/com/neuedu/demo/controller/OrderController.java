package com.neuedu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.demo.domain.Cat;
import com.neuedu.demo.domain.Order;
import com.neuedu.demo.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/toList")
	public ModelAndView toList() {
		List<Order> orders = orderService.queryAllOrder();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list2");

		mav.addObject("orders", orders);
		return mav;
	}
	
	
	@RequestMapping("/deleteOrder")
	public String deleteOrder(Integer oid) {
		orderService.deleteOrder(oid);
		return "redirect:toList";
	}
	
	@RequestMapping("/toUpdateOrder")
	public ModelAndView toUpdate(Integer oid) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update2");
		mav.addObject("order", orderService.getOrderById(oid));
		return mav;
	}
	
	@RequestMapping("/update")
	public String updateOrder(Order order) {
		orderService.editOrder(order);
		return "redirect:toList";
	}
	
	@RequestMapping("/add")
	public String addOrder(Order order) {
		orderService.addOrder(order);
		return "redirect:toList";
	} 
	 
	@RequestMapping("/toAdd")
	public String toAdd() {
	 
		return "add2";
	}
}
