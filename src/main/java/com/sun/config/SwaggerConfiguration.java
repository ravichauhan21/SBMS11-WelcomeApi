package com.sun.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configurable
@EnableSwagger2
public class SwaggerConfiguration  {
	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
		.host("http://localhost:8056")
		.select()
		.apis(RequestHandlerSelectors.any())
		.paths(PathSelectors.any())
		.build();
	}
}
