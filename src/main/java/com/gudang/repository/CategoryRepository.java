/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.repository;

import com.gudang.entity.MCategory;
import java.io.Serializable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author lucky
 */
public interface CategoryRepository extends PagingAndSortingRepository<MCategory, Serializable>{
    
}
