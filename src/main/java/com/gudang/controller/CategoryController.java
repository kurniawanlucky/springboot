/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.controller;

import com.gudang.entity.MCategory;
import com.gudang.service.CategoryService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucky
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String tampilkanDashboard(Model model){
        return "/category/master-category";
    }
    
    @RequestMapping(value = "/listCategory", method = RequestMethod.GET)
    public Page<MCategory> daftarCategory(Pageable page){
        Page<MCategory> category = categoryService.getListCategory(page);
        System.out.println("materinya"+category.toString());
        return category;
    }
    
    @RequestMapping(value = "/peserta1", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MCategory simpanPeserta(
            @RequestBody 
            @Valid MCategory peserta
    ){
        return categoryService.saveCategory(peserta);
    }
    
    @RequestMapping(value = "/peserta/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void hapusPeserta(@PathVariable("id") String id){
        categoryService.hapusCategory(Integer.valueOf(id));
    }
}
