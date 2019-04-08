package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/9/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@Configuration
public class QuoteConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("hello.wsdl");
        return marshaller;
    }

    @Bean
    public QuoteClient quoteClient(Jaxb2Marshaller marshaller) {
        QuoteClient client = new QuoteClient();
        client.setDefaultUri("http://www.webservicex.com/stockquote.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}