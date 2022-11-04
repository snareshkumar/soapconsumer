package com.soap.consumer.soapconsumer.soapwebclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.soap.consumer.soapconsumer.configuration.SOAPWebClient;
import com.soap.consumer.soapconsumer.wsdl.EmployeeInformation;
import com.soap.consumer.soapconsumer.wsdl.GetEmployeeInformationRequest;
import com.soap.consumer.soapconsumer.wsdl.GetEmployeeInformationResponse;

@RestController
@RequestMapping("/empinformation")
public class EmployeeWebClient extends WebServiceGatewaySupport {

    @Autowired
    private SOAPWebClient soapWebClient;

    @GetMapping
    public EmployeeInformation getEmployeeInformation() {
        System.out.println("controller method is invoked");
        GetEmployeeInformationRequest request = new GetEmployeeInformationRequest();
        request.setEmployeeId("100034");
        GetEmployeeInformationResponse response = (GetEmployeeInformationResponse) soapWebClient
                .callWebService("http://localhost:8080/ws", request);
        return response.getEmployeeInformation();
    }
}
