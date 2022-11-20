package com.prueba.prueba.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
@EnableWebSecurity
public class SeguridadConf {


    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager (){
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("prueba")
                .password("prueba")
                .roles("ADMIN")
                .build();
        return  new InMemoryUserDetailsManager(userDetails);

    }

    @Bean
    public SecurityFilterChain configure (HttpSecurity http) throws Exception{
        return  http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/pers/**")
                .authenticated()
                .and()
                .httpBasic(Customizer.withDefaults())
                .build();

    }
}
