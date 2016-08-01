/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.pelatihanConfig;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

/**
 *
 * @author lucky
 */
@EnableWebSecurity
public class konfogurasiSecurity extends WebSecurityConfigurerAdapter{
    
    private static final String SQL_LOGIN
            ="SELECT username,password,active as enable " +
                "from m_user WHERE username=?";
    
    private static final String SQL_PERMISSION
            ="SELECT u.username,r.nama as authority "
            + "from m_user u JOIN m_user_role ur on u.id=ur.id_user "
            + "JOIN m_roles r on ur.id_role=r.id "
            + "WHERE u.username=?";
    
    @Autowired private DataSource ds;
    @Autowired
    
    public void configurationGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .jdbcAuthentication()
                .dataSource(ds)
                .usersByUsernameQuery(SQL_LOGIN)
                .authoritiesByUsernameQuery(SQL_PERMISSION);
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
//                    .antMatchers("/halo").hasAnyRole("ADMIN","STAFF")
//                    .antMatchers("/member/list").hasAnyRole("ADMIN")    
//                    .antMatchers("/peserta/form").hasAnyRole("ADMIN")
//                    .antMatchers("/peserta/list").hasAnyRole("STAFF")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                    .loginPage("/login")
//                    .permitAll()
//                //bila berhasil login masuk ke /halo klu true pasti ke halaman halo klu tdk bisa ke halaman yg dia tuju
//                    .defaultSuccessUrl("/halo", false)
//                    .and()
//                .logout()
                .antMatchers("/member/**").access("hasRole('ADMIN')")
                .anyRequest().permitAll()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("username").passwordParameter("password")
                .and()
                .logout().logoutSuccessUrl("/login")
                .and()
                .exceptionHandling().accessDeniedPage("/login")    
                    .and()
                .addFilterAfter(new CsrfAttributeToCookieFilter(), CsrfFilter.class)
                    .csrf().csrfTokenRepository(csrfTokenRepository());
    }
    
    private CsrfTokenRepository csrfTokenRepository() {
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setHeaderName("X-XSRF-TOKEN");
        return repository;
    }
    
    //kalau manual pakai ini
//    @Autowired
//    public void configurationGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth
//                .inMemoryAuthentication()
//                .withUser("lucky")
//                .password("123")
//                .roles("USER");
//        
//    }
    
}
