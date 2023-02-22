package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CommandLineRunner 인터페이스는 구동 시점에 문자열 인자 배열을 이용하는 코드를 실행해야할 경우 사용한다.
 * 해당 코드는 run 메소드를 overriding 하여 작성한다.
 */
@SpringBootApplication // enable auto-configuration
public class SpringBootConsoleApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SpringBootConsoleApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootConsoleApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("EXECUTING : command line runner");

        for (int i = 0; i < args.length; i++) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
    }
}
