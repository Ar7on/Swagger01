package it.develhope.swaggerexrcise1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo(
                        "Swagger Exrcise",
                        "swagger FIRST exrcise",
                        "1.0.0",
                        "https://it.wikipedia.org/wiki/Licenza_MIT",
                        new Contact("Arturo","https://github.com/Ar7on","arturo.ciaceri@gmail.com"),
                        "MIT",
                        "https://it.wikipedia.org/wiki/Licenza_MIT",
                        Collections.emptyList()
                )).tags(
                        new Tag("Arturo","the Arturo's controller")
                )
                ;
    }

}
