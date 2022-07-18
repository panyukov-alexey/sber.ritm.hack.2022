package it.ritm.catalog.app.configuration;

import it.ritm.catalog.app.mapper.SomeClassMapper;
import it.ritm.catalog.app.mapper.SomeClassMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MappersConfig {

    @Bean
    public SomeClassMapper someClassMapper() {
        return new SomeClassMapperImpl();
    }

}
