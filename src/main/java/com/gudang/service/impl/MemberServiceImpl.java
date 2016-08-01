/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.service.impl;

import com.gudang.entity.MMember;
import com.gudang.repository.MemberRepository;
import com.gudang.service.MemberService;
import java.util.List;
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
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;
    
    @Override
    public Iterable<MMember> getListMember(Pageable page) {
        return memberRepository.findAll();
    }
}
