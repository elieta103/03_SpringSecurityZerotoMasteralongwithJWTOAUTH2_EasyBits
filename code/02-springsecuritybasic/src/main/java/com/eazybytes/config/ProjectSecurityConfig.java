package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    // authorizeRequests() deprecated, authorizeHttpRequests() Ok.
    // antMatchers()       deprecated, requestMatchers Ok.

    // Borrar JSESSIONID,  Inspeccionar -> Application -> cookies -> http://localhost:8080
    // Para refrescar la autenticacion de: (eazybytes, 12345)

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

        //Default behaviour for all endpoints
        /*http.authorizeHttpRequests().anyRequest().authenticated()
                        .and().formLogin()
                        .and().httpBasic();
        return http.build();*/

        // Configuration denyAll, Error 403
        /*http.authorizeHttpRequests().anyRequest().denyAll()
                        .and().formLogin()
                        .and().httpBasic();
        return http.build();*/

        // Configuration without security
        /*http.authorizeHttpRequests().anyRequest().permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();*/

        //Configuration personalizada
        http.authorizeHttpRequests()
                .requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
                .requestMatchers("/notices","/contact").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();

    }
}
