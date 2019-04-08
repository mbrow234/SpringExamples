package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 *
 * @author Michael Brown (Michael.Brown@consensuscorp.com)
 * @since 1/9/18.
 * <p>
 * All rights reserved. (C) Consensus Corporation
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner lookup(QuoteClient quoteClient) {
        return args -> {
            String ticker = "MSFT";

            if (args.length > 0) {
                ticker = args[0];
            }
            GetQuoteResponse response = quoteClient.getQuote(ticker);
            System.err.println(response.getGetQuoteResult());
        };
    }

}