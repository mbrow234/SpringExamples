package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/12/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


/*
 * Curl commands to test with:
 * curl http://localhost:8080
 * curl http://localhost:8080/people
 * curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/people
 * curl http://localhost:8080/people
 * curl http://localhost:8080/people/53149b8e3004990b1af9f229
 * curl http://localhost:8080/people/search
 * curl http://localhost:8080/people/search/findByLastName?name=Baggins
 * curl -X PUT -H "Content-Type:application/json" -d "{ \"firstName\": \"Bilbo\", \"lastName\": \"Baggins\" }" http://localhost:8080/people/53149b8e3004990b1af9f229
 * curl http://localhost:8080/people/53149b8e3004990b1af9f229
 * curl -X PATCH -H "Content-Type:application/json" -d "{ \"firstName\": \"Bilbo Jr.\" }" http://localhost:8080/people/53149b8e3004990b1af9f229
 * curl http://localhost:8080/people/53149b8e3004990b1af9f229
 * curl -X DELETE http://localhost:8080/people/53149b8e3004990b1af9f229
 * curl http://localhost:8080/people
 */