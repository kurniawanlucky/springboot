/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.service.impl;
import com.gudang.entity.MCategory;
import com.gudang.repository.CategoryRepository;
import com.gudang.service.CategoryService;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author lucky
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;
    
    @Override
    public Page<MCategory> getListCategory(Pageable page) {
        return categoryRepository.findAll(page);
    }
    
    @Override
    public MCategory saveCategory(MCategory categoryData){
        MCategory category= new MCategory();
        category.setNama(categoryData.getNama());
        category.setStatus(true);
        System.out.println("category:"+category.getStatus());
        categoryRepository.save(category);
        return category;
    }
    
    @Override
    public MCategory hapusCategory(Integer id){
        MCategory category= categoryRepository.findOne(id);
        categoryRepository.delete(category);
        return category;
    }
}
