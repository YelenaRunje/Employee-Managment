package org.example.employeemanagement.service;

import org.example.employeemanagement.DTO.UserRegistrationDto;
import org.example.employeemanagement.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
