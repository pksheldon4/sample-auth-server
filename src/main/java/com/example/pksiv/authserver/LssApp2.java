package com.example.pksiv.authserver;

import com.example.pksiv.authserver.config.AuthorizationServerConfig;
import com.example.pksiv.authserver.config.SecurityConfig;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
//@ComponentScan("com.example.pksiv.authserver")
//@EnableJpaRepositories("com.example.pksiv.authserver")
//@EntityScan("com.example.pksiv.authserver.web.model")
public class LssApp2 {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Class[] { LssApp2.class, AuthorizationServerConfig.class, SecurityConfig.class }, args);
    }

}
