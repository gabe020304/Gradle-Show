package org.gradleproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        DogStage dogStage = new DogStage();
        dogStage.main();
        TurtleStage tutleStage = new TurtleStage();
        tutleStage.main();
    }
}