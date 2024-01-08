package me.raveenaingale.springsecurity.config;

import me.raveenaingale.springsecurity.models.User;
import me.raveenaingale.springsecurity.security.SecurityUser;
import me.raveenaingale.springsecurity.services.InMemoryUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class ProjectConfig {

    @Bean
    public UserDetailsService userDetailsService(){

      // Creating a list of GrantedAuthority
        List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("read"));

        // Constructing the User instance with the list of authorities
        User user = new User();
        user.setUsername("Ravina");
        user.setPassword("123");
        user.setAuthority("READ");
        UserDetails u = new SecurityUser(user);
        List<UserDetails> users = List.of(u);
        return new InMemoryUserDetailsService(users);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
