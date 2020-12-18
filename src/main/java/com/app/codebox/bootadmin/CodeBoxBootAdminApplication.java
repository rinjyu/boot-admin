package com.app.codebox.bootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class CodeBoxBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeBoxBootAdminApplication.class, args);
    }

}
