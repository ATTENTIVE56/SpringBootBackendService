package com.gfg.amit.SpringBootBackendService.repository;

import com.gfg.amit.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
