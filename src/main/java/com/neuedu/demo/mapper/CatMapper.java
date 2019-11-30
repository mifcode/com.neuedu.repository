package com.neuedu.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.demo.domain.Cat;

@Mapper
public interface CatMapper {

	public Cat queryCatById(Integer id);
	
	public List<Cat> selectAll();
	
	public void deleteCat(Integer id);
	
	public void updateCat(Cat cat);
	
	public void insertCat(Cat cat);

}
