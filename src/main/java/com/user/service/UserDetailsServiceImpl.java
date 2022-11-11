package com.user.service;

import com.user.model.Users;
import com.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        Users users = userRepo.findByLoginId(loginId);

        if(users ==null){
            throw new UsernameNotFoundException("User Not Found");
        }

        return new PrincipalUser(users);
    }
    public Users registerUser(Users users) {
//        authenticationRequest.setPassword(passwordEncoder.encode(authenticationRequest.getPassword()));
        return userRepo.save(users);
    }
    public Users findCustomerDetails(String username) throws Exception {
//        String userId = userRepo.findByLoginId(username).getLoginId();
//        System.out.println(userId);
        if (userRepo.findByLoginId(username)==null) {
            throw new Exception("Customer Not Found with username " + username);
        } else {
            return userRepo.findByLoginId(username);
        }
    }
}
