package myservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyserviceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyserviceApplication.class, args);
    }

    public void run(String... args) {
    }

}
