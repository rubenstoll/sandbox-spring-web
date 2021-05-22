package ch.allianz.dsp.sandbox.hello;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mail")
@Getter
@Setter
@NoArgsConstructor
public class HelloConfigProperties {

    private String hostName;

    private int port;

    private String from;

    // standard getters and setters
}