package com.ravedev.clinicVet.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Biblioteca")
                        .version("v1.0.0")
                        .description("API REST de Biblioteca API.")
                        .contact(new Contact()
                                .name("ravedev")
                                .url("https://rvera-p.github.io/")
                                .email("rafael.verapinto@gmail.com"))
                        .termsOfService(""));
    }
}
