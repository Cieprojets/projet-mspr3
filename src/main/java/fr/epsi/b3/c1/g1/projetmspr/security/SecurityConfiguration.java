package fr.epsi.b3.c1.g1.projetmspr.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


import java.util.function.Function;

@Configuration
public class SecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username( "user" )
                .password( "password" )
                .roles( "USER" )
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username( "admin" )
                .password( "password" )
                .roles( "USER", "ADMIN" )
                .build();
        return new InMemoryUserDetailsManager( user, admin );
    }
}
