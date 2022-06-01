package neri.dev.com.conexaoaurorajava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 ***/
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SwaggerConfig {

    /**
    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .enableUrlTemplating(false);
    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API MSD")
                .description("MSD Hackathon")
                .version("1.0")
                .build();
    }

    **/
}