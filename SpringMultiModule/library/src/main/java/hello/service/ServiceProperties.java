package hello.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/26/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@ConfigurationProperties("service")
public class ServiceProperties {

    /**
     * A message for the service.
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}