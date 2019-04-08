package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 12/14/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
