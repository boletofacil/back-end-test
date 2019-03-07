package br.com.bb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bb.maxoccurrence.CategorieWithMaxCharOccurrence;
import br.com.bb.model.Category;
import br.com.bb.repository.CategoryRepository;
import br.com.bb.service.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategorieWithMaxCharOccurrence categorieWithMaxCharOccurrence;
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategorieWithMaxCharOccurrence(char findFor) {
		return categorieWithMaxCharOccurrence.getCategorieWithMaxCharOccurrence(this.findAll(), findFor);
	}

	
}
