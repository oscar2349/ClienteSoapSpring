package com.nicordesings.soapclient.models;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import io.netty.handler.codec.http.HttpResponse;


public class PeticionesRest {
	
	@Autowired
	RestTemplate restTemplate;
	HttpHeaders headers = new HttpHeaders();
	Charset charset;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PeticionesRest.class.getName());
	public String ConsumeServicio() {
		
		
		String url = "http://10.194.194.151:8080/ords/WS_Xchange/Kic_Adm_Ice.Pic_Proc_Int_SW_Publ";
		Map<String, String> headers = new HashMap<String, String>();
		
		headers.put("inInexCod", "951");
		headers.put("Authorization", "Basic V1NJTlRFRzpBUEVYMTIzNA==");
		headers.put("Accept-Encoding", "gzip,deflate");
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("inInexCod", "951");
		parametros.put("clXMLSolic", "<INTERFAZ951SOLIC><PARAMS><EMPCEDULA>80852427</EMPCEDULA></PARAMS></INTERFAZ951SOLIC>");
		
		com.mashape.unirest.http.HttpResponse<String> response = null;
		try {
			response =Unirest.get(url)
			        .headers(headers)
			        .queryString(parametros)
			        .asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        LOGGER.info("response status info : {}", response.getStatus());
        LOGGER.info("response status message info : {}", response.getBody());
		
		return null;

	}

}
