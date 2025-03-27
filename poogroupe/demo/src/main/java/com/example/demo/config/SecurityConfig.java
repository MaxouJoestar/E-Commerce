package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login", "/error", "/css/**", "/js/**").permitAll() // Permet accès libre à certaines routes
                .requestMatchers("/admin/**").hasRole("ADMIN") // Accès restreint aux admins
                .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN") // Accès aux utilisateurs et admins
                .anyRequest().authenticated() // Tout le reste nécessite authentification
            )
            .formLogin(form -> form
                .loginPage("/login") // Page de connexion personnalisée
                .defaultSuccessUrl("/home", true) // Redirection après connexion
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout") // Redirection après déconnexion
                .permitAll()
            );

        return http.build();
    }
}