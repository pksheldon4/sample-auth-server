package com.pksheldon4.sample.authserver;

import com.pksheldon4.sample.authserver.config.AuthorizationServerConfig;
import com.pksheldon4.sample.authserver.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{AuthServerApplication.class, AuthorizationServerConfig.class, SecurityConfig.class}, args);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}