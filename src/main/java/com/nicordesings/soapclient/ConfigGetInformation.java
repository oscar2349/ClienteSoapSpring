package com.nicordesings.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfigGetInformation {

	@Bean
	public Jaxb2Marshaller marshaller() {

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.nicordesings.soapclient");
		return marshaller;

	}

	@Bean
	public ClientRest clientrest(Jaxb2Marshaller marshaller) {

		ClientRest clientrest = new ClientRest();
		clientrest.setDefaultUri("https://osb.urosario.edu.co/uxxi-URO/Uro_Bpm/Proxies/Uro_Bpm_Ps/urn:getInformacion");
		clientrest.setMarshaller(marshaller);
		clientrest.setUnmarshaller(marshaller);
		return clientrest;

	}

}
