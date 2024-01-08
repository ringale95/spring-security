//package me.raveenaingale.springsecurity.services;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.List;
//
//public class InMemoryUserDetailsService implements UserDetailsService {
//
//    private final List<UserDetails> users;
//
//    public InMemoryUserDetailsService(List<UserDetails> users){
//        this.users = users;
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //stream is a sequence of elements that can be processed in parallel or sequentially.
//        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElseThrow(()->new UsernameNotFoundException("User Not found"));
//    //The loadUserByUsername(String username) method searches the list of users for the given username and returns the desired UserDetails instance
//    }
//}
