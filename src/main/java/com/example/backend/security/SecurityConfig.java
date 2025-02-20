package com.example.backend.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    //when an user try to auth do that
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // compare the password getting from user and the password in database
      auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //without csrf
        http.csrf().disable();
        //we will not use sessions
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers("/addImmobillier/**",
                "/changeOwnerShip/**",
                "/sell_immobiliers/**",
                "/myImmobiliers").hasAuthority("USER");

        http.authorizeRequests().antMatchers(
                "/approveImmobillier/**",
                "/approveChangeOwnerShip/**",
                "/immobiliers",
                "/approvedImmobiliers/**",
                "/waitingImmobiliers/**",
                "/waitingChangeImmobiliers/**"
                ).hasAuthority("ADMIN");

        http.authorizeRequests().antMatchers("/addUser/**" ,"/approveUser/**","/sell_immobiliers/**","/immobillierDetails/**").permitAll();
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }


}
