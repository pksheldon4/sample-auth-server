package com.pksheldon4.sample.authserver.persistence;

import com.pksheldon4.sample.authserver.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
