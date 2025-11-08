package edu.example.incidents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IncidentsApplication {
    public static void main(String[] args) {
        SpringApplication.run(IncidentsApplication.class, args);
    }
}

@RestController
class StatusController {
    @GetMapping("/status")
    public String status() {
        return "OK";
    }

    // intentionally bad variable name to trigger checkstyle
    int badName = 1;
}
