/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.controller;

import com.gudang.entity.MMember;
import com.gudang.repository.MemberRepository;
import com.gudang.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucky
 */
@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;
    
    @RequestMapping(value = "/pesertaTest", method = RequestMethod.GET)
    public Iterable<MMember> daftarPeserta(Pageable page){
        //Page<MMember1> materi = memberRepository.findAll(page);
        Iterable<MMember> materi = memberService.getListMember(page);
        System.out.println("materinya"+materi.toString());
        return materi;
    }
    
    @RequestMapping(value = "/masterMember", method = RequestMethod.GET)
    public String tampilkanForm(Model model){
        return "/member/master-member";
    }
    
}
