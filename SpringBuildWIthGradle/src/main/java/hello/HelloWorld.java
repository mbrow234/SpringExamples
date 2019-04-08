package hello;

import org.joda.time.LocalTime;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 11/21/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class HelloWorld {

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
