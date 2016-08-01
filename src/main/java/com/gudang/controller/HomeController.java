///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.gudang.controller;
//
//import com.gudang.entity.MMember1;
//import com.gudang.repository.MemberRepository;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// *
// * @author lucky
// */
//@Controller
//@RequestMapping("/home")
//public class HomeController {
//    @Autowired
//    MemberRepository memberRepository;
//    
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,true));
//    }
//    
//    @RequestMapping(value = "/page", method = RequestMethod.GET)
//    public String tampilkanForm(Model model){
//        return "/home/page";
//    }
//    
//    @RequestMapping(value = "/dashBoard", method = RequestMethod.GET)
//    public String tampilkanDashboard(Model model){
//        return "/home/dashboard";
//    }
//    
//    @RequestMapping(value = "/list")
//    public void daftarPeserta(Model m){
//        m.addAttribute("daftarPeserta", memberRepository.findAll());
//    }
//    
//    @RequestMapping(value = "/delete")
//    public String delete(@RequestParam("id") Integer id){
//        memberRepository.delete(id);
//        return "redirect:list";
//    }
//    
//    @RequestMapping(value = "/form", method = RequestMethod.GET)
//    public String tampilkanForm(@RequestParam(value = "id", required = false) Integer id, Model model){
//        
//        MMember1 newp= new MMember1();
//        model.addAttribute("peserta",newp);
//        
//        if(id!=null){
//            MMember1 p=memberRepository.findOne(id);
//            if(p!=null){
//                model.addAttribute("peserta", p);
//            }
//        }
//        return "/home/registrasi";
//    }
//    
//    @RequestMapping(value = "/form", method = RequestMethod.POST)
//    public String prosesForm(@Valid MMember1 peserta, BindingResult errors){
//        if(errors.hasErrors()){
//            return "/peserta/form"; 
//        }
//        memberRepository.save(peserta);
//        return "redirect:list";
//    }
//}
