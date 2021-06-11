package com.nicordesings.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);

	}
	
	@Bean
	CommandLineRunner lookup(ClientRest clientRest) {
		System.out.println("Prueba");
		
		return args->{
			
			GetInformacionResponse getInformacion = clientRest.getInformacion("79544742");
			System.out.println(getInformacion.getReturn().getValue().primerApellido.getValue());
			System.out.println(getInformacion.getReturn().getValue().segundoApellido.getValue());
			
		};
		
		
	}

}
