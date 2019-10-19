package com.julioluis.padronbocachica.servicies.impl;


import com.julioluis.padronbocachica.entities.Rol;
import com.julioluis.padronbocachica.entities.User;
import com.julioluis.padronbocachica.repositories.UserRepository;
import com.julioluis.padronbocachica.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findByUsername(username);

        if(!user.isPresent())
            throw new UsernameNotFoundException(username);

        return toUserDetail(user.get());
    }

    private UserDetails toUserDetail(User user) {
        return org.springframework.security.core.userdetails.User.
                withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(rols(user.getRolList()))
                .build();
    }

    private String[] rols(List<Rol> rolList) {
        String [] rols=new String[rolList.size()];

        for (int i=0;i<rolList.size();i++) {
            rols[i]=rolList.get(i).getDescription();
        }
        return rols;
    }
}
