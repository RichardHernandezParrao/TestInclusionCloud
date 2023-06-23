package com.codeforces.problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.codeforces.problem"})
public class TestInclusionCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestInclusionCloudApplication.class, args);
    }
}