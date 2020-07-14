package com.bida.springHomeWork.demo.service;

import com.bida.springHomeWork.demo.config.UserDetailsImpl;
import com.bida.springHomeWork.demo.domain.User;
import com.bida.springHomeWork.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new EntityNotFoundException("No user = " + username));
        UserDetailsImpl userDetails = new UserDetailsImpl(user);
        return userDetails;
    }
}
