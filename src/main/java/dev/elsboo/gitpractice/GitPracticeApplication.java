package dev.elsboo.gitpractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GitPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitPracticeApplication.class, args);
        log.info("2052 work1");
        log.info("2052 work2");
        log.info("2052 work3");
        log.info("2052 work4");
    }

}
