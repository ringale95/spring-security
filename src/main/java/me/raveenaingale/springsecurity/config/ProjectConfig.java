package me.raveenaingale.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration // config class
public class ProjectConfig {

    @Bean //adds returned value in bean in spring context
        public UserDetailsService userDetailsService(){
        var userDetailService = new InMemoryUserDetailsManager();
        var user = User.withUsername("Raveena").password("123").authorities("read").build();

        userDetailService.createUser(user);
        return userDetailService;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
