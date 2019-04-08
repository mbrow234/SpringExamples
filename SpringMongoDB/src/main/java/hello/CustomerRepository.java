package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/15/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
