package com.sbfapp.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sbfapp.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
