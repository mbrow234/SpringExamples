package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/6/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }
}
