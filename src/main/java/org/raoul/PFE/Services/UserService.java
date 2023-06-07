/**package org.raoul.PFE.Services;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.raoul.PFE.entities.User;
import org.raoul.PFE.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserService implements UserDetailsService {

   @Autowired
   private UserRepository userRepository;

   @Override
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userRepository.findByUsername(username)
               .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

       return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
               getAuthorities(user.getRoles()));
   }

   private Collection<? extends GrantedAuthority> getAuthorities(Set<String> roles) {
       return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
   }
}
**/