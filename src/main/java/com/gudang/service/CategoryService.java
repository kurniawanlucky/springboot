/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.service;

import com.gudang.entity.MCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author lucky
 */
public interface CategoryService {
    Page<MCategory> getListCategory(Pageable page);
    
    MCategory saveCategory(MCategory category);
    
    MCategory hapusCategory(Integer id);
}
