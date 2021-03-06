package hello;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 11/16/17.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
