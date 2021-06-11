package com.nicordesings.soapclient;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import com.nicordesings.soapclient.GetInformacion;
import com.nicordesings.soapclient.GetInformacionResponse;


public class ClientRest extends WebServiceGatewaySupport {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientRest.class);
	
	public GetInformacionResponse getInformacion(String id) {
		
		GetInformacion getInformacion = new GetInformacion();
		
		ObjectFactory objectFactory = new ObjectFactory();
		
		JAXBElement<String> documento = objectFactory.createGetInformacionIdentification(id);
		
		getInformacion.setIdentification(documento);
		
		logger.info("Request"  + getInformacion );
		GetInformacionResponse response = (GetInformacionResponse) getWebServiceTemplate()
				.marshalSendAndReceive("https://osb.urosario.edu.co/uxxi-URO/Uro_Bpm/Proxies/Uro_Bpm_Ps",getInformacion,
						new SoapActionCallback("https://osb.urosario.edu.co/uxxi-URO/Uro_Bpm/Proxies/Uro_Bpm_Ps"));
		return response;
		
		
	}

}
