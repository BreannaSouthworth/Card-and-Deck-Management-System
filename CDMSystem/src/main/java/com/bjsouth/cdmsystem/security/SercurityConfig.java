/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Bree
 */
@Configuration
@EnableWebSecurity
public class SercurityConfig extends WebSecurityConfigurerAdapter{
    // TODO: autowire user profiles repo
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/", "/home").permitAll()
                    .antMatchers("/css/**", "/js/**", "/fonts/**").permitAll()
                    .anyRequest().hasRole("USER")
                .and()
                .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login?login_error=1")
                    .permitAll()
                .and()
                .logout()
                    .logoutSuccessUrl("/")
                    .permitAll(); 
    }
}
