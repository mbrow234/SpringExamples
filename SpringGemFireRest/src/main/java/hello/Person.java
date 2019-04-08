package hello;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.gemfire.mapping.annotation.Region;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/15/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@Data
@Region("People")
public class Person {

    private static AtomicLong COUNTER = new AtomicLong(0L);

    @Id
    private Long id;

    private String firstName;
    private String lastName;

    @PersistenceConstructor
    public Person() {
        this.id = COUNTER.incrementAndGet();
    }
}
