package main.java.hello.appmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/8/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@EnableAutoConfiguration
public class AppmasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppmasterApplication.class, args);
    }
}