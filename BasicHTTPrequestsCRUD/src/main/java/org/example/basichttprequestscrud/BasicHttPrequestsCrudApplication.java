package org.example.basichttprequestscrud;
/**
 *   @author Bohdan 
 *   @project basichttprequestscrud
 *   @class BasicHttPrequestsCrudApplication.java
 *   @version 1.0
 *   @since 4/17/2025 09:42
 */

import org.example.basichttprequestscrud.model.User;
import org.example.basichttprequestscrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicHttPrequestsCrudApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(BasicHttPrequestsCrudApplication.class, args);
    }

    @Override
    public void run(String... args)  {
        
        if (userRepository.count() == 0) {
            User user = new User("Default User", "default@example.com");
            userRepository.save(user);
            System.out.println("Default user created: " + user);
        }
    }
}
