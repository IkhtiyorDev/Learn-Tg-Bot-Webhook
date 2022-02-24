package dev.ikhtiyor.learntgbotwebhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class LearnTgBotWebhookApplication {

    public static void main(String[] args) {

        ApiContextInitializer.init();

        SpringApplication.run(LearnTgBotWebhookApplication.class, args);
    }

}
