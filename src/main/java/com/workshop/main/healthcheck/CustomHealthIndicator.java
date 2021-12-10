package com.workshop.main.healthcheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
//import java.util.concurrent.ThreadLocalRandom;

@Component()
public class CustomHealthIndicator implements HealthIndicator {
    
    @Override
    public Health health() {
        //Simulate the application should be up only 50% of the time.
        /*
        double chance = ThreadLocalRandom.current().nextDouble();
        Health.Builder status = Health.up();

        System.out.println("chance : " + chance);
        if (chance > 0.5) {
            status = Health.down();
        }
        return status.build();
        */
        
        return Health.down().build();
    }

}