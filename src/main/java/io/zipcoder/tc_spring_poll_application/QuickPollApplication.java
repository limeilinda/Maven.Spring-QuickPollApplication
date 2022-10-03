package io.zipcoder.tc_spring_poll_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickPollApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(QuickPollApplication.class, args);
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}