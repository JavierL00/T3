//package com.clases.apirest.app;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.swing.*;

//@Configuration
//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    //  @Autowired
    //  public void configureGlobal(AuthenticationManagerBuilder build) throws Exception {
        //      build.inMemoryAuthentication()
        //              .passwordEncoder(passwordEncoder())
        //             .withUser("admin").password(passwordEncoder().encode("12345"))
        //            .roles("ADMIN", "USER");
        // }

    //public BCryptPasswordEncoder passwordEncoder() {
        //    return new BCryptPasswordEncoder();
        //}

    //@Override
    //protected void configure(HttpSecurity http) throws Exception{
    //    http.authorizeRequests()
    //            .antMatchers("/","/css/**","/js/**","/api/usuarios", "/api/actividades")
    //            .permitAll()
    //            .antMatchers("/uploads/**").hasAnyRole("USER")
    //            .antMatchers("**/form").hasAnyRole("ADMIN")
    //           .anyRequest().authenticated()
    //            .and()
    //            .formLogin().loginPage("/login").permitAll()
    //            .and()
    //            .logout().permitAll();
    //}

//}
