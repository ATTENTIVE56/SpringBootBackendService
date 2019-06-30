package com.gfg.amit.SpringBootBackendService.repository;

import com.gfg.amit.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
