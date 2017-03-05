package com.livesound.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.livesound.live.core.UserService;

@SpringBootApplication
@Import(UserService.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
