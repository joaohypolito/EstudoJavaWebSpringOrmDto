package com.javaspringdto.user.services;

import com.javaspringdto.user.dtos.UserDTO;
import com.javaspringdto.user.entities.User;
import com.javaspringdto.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }

}
