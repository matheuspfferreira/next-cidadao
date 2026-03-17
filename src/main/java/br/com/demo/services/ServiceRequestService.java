package br.com.demo.services;

import br.com.demo.models.interfaces.ServiceRequestType;

public class ServiceRequestService {
    public static Boolean sendServiceRequest(ServiceRequestType serviceRequestType) {
        return serviceRequestType.sendServiceRequest();
    }
}
