package com.kk.loginregisterhub.Repository;

import com.kk.loginregisterhub.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
