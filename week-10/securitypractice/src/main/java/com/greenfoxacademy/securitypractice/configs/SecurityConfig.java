package com.greenfoxacademy.securitypractice.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
    auth
        .inMemoryAuthentication()
          .withUser("admin")
          .password("{noop}admin")
          .roles("ADMIN")
        .and()
          .withUser("user1")
          .password("{noop}test")
          .roles("USER");
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity
        .authorizeRequests()
          .antMatchers("/admin/**").hasRole("ADMIN")
          .anyRequest().authenticated()
          .and()
        .formLogin()
          .loginPage("/login")
          .permitAll()
          .and()
        .logout()
          .logoutSuccessUrl("/login?logout")
          .permitAll();
  }
}
