package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/17/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public interface BookRepository {

    Book getByIsbn(String isbn);
}
