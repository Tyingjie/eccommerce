package com.tyj.Eccormerce.security;

import com.tyj.Eccormerce.dto.UserDto;
import com.tyj.Eccormerce.entity.User;
import com.tyj.Eccormerce.exception.NotFoundException;
import com.tyj.Eccormerce.repository.UserRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    public CustomUserDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        User user = userRepo.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("User/Email Not Found"));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
