package com.javaspringdto.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaspringdto.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}