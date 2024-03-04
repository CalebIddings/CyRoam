package coms309;

import coms309.Friends.FriendObj;
import coms309.Friends.FriendObjInterface;
import coms309.Pin.PinController;
import coms309.Progress.Progress;
import coms309.Progress.ProgressRepository;
import coms309.Users.User;
import coms309.Users.UserInterface;
import coms309.Pin.Pin;
import coms309.Pin.PinRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Vivek Bengre
 */

@SpringBootApplication
public class Application {
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}
