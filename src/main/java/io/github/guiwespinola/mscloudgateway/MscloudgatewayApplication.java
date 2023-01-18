package io.github.guiwespinola.mscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MscloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscloudgatewayApplication.class, args);
	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route(r -> r.path("/clients/**").uri("lb://msclientes"))
				.route(r -> r.path("/cards/**").uri("lb://mscartoes"))
				.route(r -> r.path("/credit-rating/**").uri("lb://msavaliadorcredito"))
				.build();
	}
/* Sempre que uma requisição tentar acessar o path designado acima, o gateway irá acionar o loadbalancer (lb),
chamando pelo nome que consta no application.yml (msclientes) */
}
