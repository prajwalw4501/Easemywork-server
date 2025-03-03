package com.easemywork.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.easemywork.pojos.Role;
import com.easemywork.security.JWTRequestFilter;

import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("deprecation")
@EnableWebSecurity // mandatory
@Configuration // mandatory
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {

    @Autowired
    private JWTRequestFilter filter;

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint((request, response, ex) -> {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, ex.getMessage());
        }).and().authorizeRequests().requestMatchers("/auth/**").permitAll()
                .requestMatchers("/api/user/**").permitAll()
                .requestMatchers("/api/owner/**").permitAll()
                .requestMatchers("/pay/**").permitAll()
                .requestMatchers("/**", "/swagger*/**", "/v*/api-docs/**")
                .permitAll() // enabling
                .requestMatchers(HttpMethod.OPTIONS).permitAll().anyRequest().authenticated().and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    // configure auth mgr bean : to be used in Authentication REST controller
    @Bean
    public AuthenticationManager authenticatonMgr(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        org.springframework.web.cors.CorsConfiguration corsConfig = new org.springframework.web.cors.CorsConfiguration();
        corsConfig.addAllowedOrigin("https://easemywork.vercel.app/"); // Allow the deployed link
        corsConfig.addAllowedMethod("*"); // Allow all HTTP methods (GET, POST, etc.)
        corsConfig.addAllowedHeader("*"); // Allow all headers
        corsConfig.setAllowCredentials(true); // Allow credentials (cookies, authorization headers)

        org.springframework.web.cors.UrlBasedCorsConfigurationSource source = new org.springframework.web.cors.UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig); // Apply the CORS configuration to all endpoints

        return source;
    }
}
