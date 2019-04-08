package hello;

import org.springframework.stereotype.Service;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/24/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@Service
public class GreetingService {

    public String greet() {
        return "Hello World";
    }
}
