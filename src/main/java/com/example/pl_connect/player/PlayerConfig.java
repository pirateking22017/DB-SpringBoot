package com.example.pl_connect.player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repository) {
        return args -> {
            Player rohitSharma = new Player(
                    "Rohit Sharma",
                    "India",
                    "Batsman",
                    36,
                    250,   
                    230,   
                    0.0,    
                    9500.0, 
                    0.0,    
                    150,    
                    20,     
                    130.0,  
                    0.0,    
                    "Team India"
            );
            repository.save(rohitSharma);

            Player klRahul = new Player(
                    "KL Rahul",
                    "India",
                    "Batsman",
                    31,
                    150,    
                    140,    
                    0.0,    
                    6000.0, 
                    0.0,    
                    100,    
                    10,     
                    140.0,  
                    0.0,    
                    "Team India"
            );
            repository.save(klRahul);
        };
    }
}
