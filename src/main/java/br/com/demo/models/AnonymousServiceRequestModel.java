package br.com.demo.models;

import br.com.demo.models.enums.ServiceCategory;
import br.com.demo.models.enums.ServicePriority;
import br.com.demo.models.interfaces.ServiceRequestType;

import java.util.List;

public class AnonymousServiceRequestModel extends ServiceRequestModel implements ServiceRequestType {
    public AnonymousServiceRequestModel(Integer id, String description, ServiceCategory category, ServicePriority priority,
                                        String location, List<ServiceHistoryModel> history) {
        super(id, description, category, priority, location);
    }

    public Boolean sendServiceRequest() {
        return false;
    }
}
