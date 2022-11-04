package com.soap.consumer.soapconsumer.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class SOAPWebClient {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    public Object callWebService(String url, Object request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return webServiceTemplate.marshalSendAndReceive(url, request);
    }

}
