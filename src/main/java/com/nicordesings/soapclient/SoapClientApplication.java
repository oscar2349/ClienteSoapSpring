package com.nicordesings.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nicordesings.soapclient.models.PeticionesRest;

import io.netty.handler.codec.http.HttpMethod;
import reactor.core.publisher.Mono;



@SpringBootApplication
public class SoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);

	}
	
	 @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	
	@Bean
	CommandLineRunner lookup(ClientRest clientRest) {
		System.out.println("Prueba");
		
		return args->{
			
			GetInformacionResponse getInformacion = clientRest.getInformacion("79544742");
			System.out.println(getInformacion.getReturn().getValue().primerApellido.getValue());
			System.out.println(getInformacion.getReturn().getValue().segundoApellido.getValue());
			PeticionesRest PeticionesRest = new PeticionesRest();
			PeticionesRest.ConsumeServicio();
			
			
		};
		
		
	}

}
