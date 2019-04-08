package hello;

import org.springframework.data.repository.CrudRepository;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/25/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Long> {

}
