package com.example.pksiv.authserver.persistence;

import com.example.pksiv.authserver.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
