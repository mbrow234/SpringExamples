package hello;

import org.springframework.data.gemfire.repository.query.annotation.Trace;
import org.springframework.data.repository.CrudRepository;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/12/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface PersonRepository extends CrudRepository<Person, String> {


    @Trace
    Person findByName(String name);

    @Trace
    Iterable<Person> findByAgeGreaterThan(int age);

    @Trace
    Iterable<Person> findByAgeLessThan(int age);

    @Trace
    Iterable<Person> findByAgeGreaterThanAndAgeLessThan(int greaterThanAge, int lessThanAge);

}
