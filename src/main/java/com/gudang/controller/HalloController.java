/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucky
 */
@Controller
@RequestMapping("/test")
public class HalloController {
    
    @RequestMapping("/halorest")
    @ResponseBody
    public Map<String,Object> haloresr(@RequestParam(value="nama", required=false) String nama){
        Map<String,Object> hasil= new HashMap<>();
        hasil.put("nama", nama);
        hasil.put("waktu", new Date());
        return hasil;
    }
    
    @RequestMapping("/halo")
    public void halohtml(@RequestParam(value="nama", required=false) String nama, Model model){
        model.addAttribute("nama",nama);
        model.addAttribute("waktu", new Date()); 
    }
}
