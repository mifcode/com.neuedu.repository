package com.neuedu.demo.service;

import java.util.List;

import com.neuedu.demo.domain.Cat;

public interface CatService {

	public Cat getCatById(Integer id);

	public List<Cat> getAll();

	public void deleteCat(Integer id);

	public void updateCat(Cat cat);

	public void insertCat(Cat cat);
}
