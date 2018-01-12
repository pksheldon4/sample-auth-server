package com.example.pksiv.authserver;

import com.example.pksiv.authserver.config.AuthorizationServerConfig;
import com.example.pksiv.authserver.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("com.example.pksiv.authserver")
//@EnableJpaRepositories("com.example.pksiv.authserver")
//@EntityScan("com.example.pksiv.authserver.web.model")
public class AuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{AuthServerApplication.class, AuthorizationServerConfig.class, SecurityConfig.class}, args);
	}
}