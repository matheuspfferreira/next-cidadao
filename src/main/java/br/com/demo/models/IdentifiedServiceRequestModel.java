package br.com.demo.models;

import br.com.demo.models.enums.ServiceCategory;
import br.com.demo.models.enums.ServicePriority;
import br.com.demo.models.interfaces.ServiceRequestType;

import java.util.List;

public class IdentifiedServiceRequestModel extends ServiceRequestModel implements ServiceRequestType {
    public IdentifiedServiceRequestModel(Integer id, String description, ServiceCategory category,
                                         ServicePriority priority, String location) {
        super(id, description, category, priority, location);
    }

    public Boolean sendServiceRequest() {
        return true;
    }

}
