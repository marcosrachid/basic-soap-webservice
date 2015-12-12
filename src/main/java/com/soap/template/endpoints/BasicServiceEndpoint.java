package com.soap.template.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.template.services.BasicService;
import com.soap.template.webservices.basicservice.NewRequest;

@Endpoint
public class BasicServiceEndpoint {
	private static final String TARGET_NAMESPACE = "http://com/soap/template/webservices/basicservice";

	@Autowired
	private BasicService basicService;

	@PayloadRoot(localPart = "NewRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload JAXBElement<String> newBasic(@RequestPayload NewRequest request) {
		QName qNameRequest = new QName(TARGET_NAMESPACE, "NewRequest");
		QName qNameResponse = new QName(TARGET_NAMESPACE, "NewResponse");
		JAXBElement<String> response = new JAXBElement<String>(qNameResponse, String.class,
				this.basicService.newBasic(new JAXBElement<String>(qNameRequest, String.class, request.getContent())));
		return response;
	}

	@PayloadRoot(localPart = "EchoRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload JAXBElement<String> echo(@RequestPayload JAXBElement<String> request) {
		JAXBElement<String> response = this.basicService.echo(request);
		return response;
	}

	public void setBasicService(BasicService basicService) {
		this.basicService = basicService;
	}

}