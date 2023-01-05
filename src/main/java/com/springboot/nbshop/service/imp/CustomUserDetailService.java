package com.springboot.nbshop.service.imp;


import com.springboot.nbshop.entity.CustomUserDetail;
import com.springboot.nbshop.entity.User;
import com.springboot.nbshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<User> user = userService.getUserByEmail(email);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user.map(CustomUserDetail::new).get(); // convert optional tu <User> sang <CustomUserDetail> sau do get() data tu optional
    }
}
