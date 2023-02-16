package com.nate_orecchio.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nate_orecchio.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
