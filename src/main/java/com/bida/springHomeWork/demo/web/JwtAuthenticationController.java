package com.bida.springHomeWork.demo.web;

import com.bida.springHomeWork.demo.config.JwtTokenUtil;
import com.bida.springHomeWork.demo.service.JwtAuthenticationService;
import com.bida.springHomeWork.demo.service.JwtUserDetailsService;
import com.bida.springHomeWork.demo.web.vm.JwtRequest;
import com.bida.springHomeWork.demo.web.vm.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class JwtAuthenticationController {

    @Autowired
    private JwtAuthenticationService jwtAuthenticationService;

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest jwtRequest){
        jwtAuthenticationService.authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
        final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }
}
