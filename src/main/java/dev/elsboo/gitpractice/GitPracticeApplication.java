package dev.elsboo.gitpractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GitPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitPracticeApplication.class, args);
        log.info("dev work1");
        log.info("dev work2");
    }

}
