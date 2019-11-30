package com.neuedu.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demo.domain.Cat;
import com.neuedu.demo.mapper.CatMapper;
import com.neuedu.demo.service.CatService;
@Service
public class CatServiceImpl implements CatService {

	@Autowired
	CatMapper catMapper;
	
	@Override
	public Cat getCatById(Integer id) {
		// TODO Auto-generated method stub
		return catMapper.queryCatById(id);
	}

	@Override
	public List<Cat> getAll() {
		
		return catMapper.selectAll();
	}

	@Override
	public void deleteCat(Integer id) {
		catMapper.deleteCat(id);
		
	}

	@Override
	public void updateCat(Cat cat) {
		// TODO Auto-generated method stub
		catMapper.updateCat(cat);
	}

	@Override
	public void insertCat(Cat cat) {
		// TODO Auto-generated method stub
		catMapper.insertCat(cat);
	}

}
