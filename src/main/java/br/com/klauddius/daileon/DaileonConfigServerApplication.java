package br.com.klauddius.daileon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DaileonConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaileonConfigServerApplication.class, args);
    }

}

