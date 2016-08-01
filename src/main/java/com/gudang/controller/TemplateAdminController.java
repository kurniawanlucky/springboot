/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author lucky
 */
@Controller
@RequestMapping("/templateAdmin")
public class TemplateAdminController {
    @RequestMapping(value = "/header-admin", method = RequestMethod.GET)
    public String tampilkanForm(Model model){
        return "/design/header-admin";
    }
    @RequestMapping(value = "/side-admin", method = RequestMethod.GET)
    public String tampilkanFooter(Model model){
        return "/design/side-menu-admin";
    }
    
}
