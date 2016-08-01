/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.controller;

import com.gudang.entity.MMember;
import com.gudang.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucky
 */
@RestController
@RequestMapping("/JSMember")
public class MemberJSController {
    @Autowired
    MemberService memberService;
    
    @RequestMapping(value = "/listMember", method = RequestMethod.GET)
    public Iterable<MMember> daftarMember(Pageable page){
        Iterable<MMember> member = memberService.getListMember(page);
        System.out.println("materinya"+member.toString());
        return member;
    }
    
}
