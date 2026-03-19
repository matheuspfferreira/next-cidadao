package br.com.demo.repositories;

import br.com.demo.models.ServiceRequestModel;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ServiceRequestRepository {
    private final List<JSONObject> serviceRequests;

    public ServiceRequestRepository(List<JSONObject> serviceRequests) {
        this.serviceRequests = new ArrayList<>();
    }

    public List<JSONObject> getServiceRequestsRepository() {
        return this.serviceRequests;
    }

    public void addServiceRequest(ServiceRequestModel serviceRequest) {
        JSONObject serviceRequests = new JSONObject();

        serviceRequests.put("id", serviceRequest.getId());
        serviceRequests.put("description", serviceRequest.getDescription());
        serviceRequests.put("category", serviceRequest.getCategory());
        serviceRequests.put("priority", serviceRequest.getPriority());
        serviceRequests.put("location", serviceRequest.getLocation());
        serviceRequests.put("history", serviceRequest.getHistory());

        this.serviceRequests.add(serviceRequests);
    }
}
