package com.neuedu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.neuedu.demo.domain.Cat;
import com.neuedu.demo.service.CatService;

@Controller
public class CatController {

	@Autowired
	private CatService catService;

	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		Page page = PageHelper.startPage(1, 5);
		mav.addObject("cats", catService.getAll());
		// 同时页面还需要什么？需要总页数，当前第几页
		mav.addObject("pageCount", page.getPages());
		mav.addObject("pageNum", page.getPageNum());
		mav.addObject("pageSize", page.getPageSize());
		return mav;
	}

	@RequestMapping("/deleteCat")
	public String deleteCat(Integer id) {
		catService.deleteCat(id);
		return "redirect:getAll";
	}

	@RequestMapping("/addCat")
	public String addCat(Cat cat) {
		catService.insertCat(cat);
		return "redirect:getAll";
	}

	@RequestMapping("/updateCat")
	public String updateCat(Cat cat) {
		catService.updateCat(cat);
		return "redirect:getAll";
	}

	@RequestMapping("/toAddCat")
	public ModelAndView toAddCat() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("add");
		return mav;
	}

	@RequestMapping("/toUpdateCat")
	public ModelAndView toUpdateCat(Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update");
		mav.addObject("cat", catService.getCatById(id));
		return mav;
	}

	
}
