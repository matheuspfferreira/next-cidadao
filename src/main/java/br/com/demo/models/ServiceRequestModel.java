package br.com.demo.models;

import br.com.demo.models.enums.ServiceCategory;
import br.com.demo.models.enums.ServicePriority;
import java.util.List;
import java.util.ArrayList;

public class ServiceRequestModel {
    private Integer id;
    private String description;
    private ServiceCategory category;
    private ServicePriority priority;
    private String location;
    private List<ServiceHistoryModel> history;

    public ServiceRequestModel(Integer id, String description, ServiceCategory category,
                               ServicePriority priority, String location) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.location = location;
        this.history = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceCategory getCategory() {
        return category;
    }

    public void setCategory(ServiceCategory category) {
        this.category = category;
    }

    public ServicePriority getPriority() {
        return priority;
    }

    public void setPriority(ServicePriority priority) {
        this.priority = priority;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<ServiceHistoryModel> getHistory() {
        return history;
    }

    public void setHistory(List<ServiceHistoryModel> history) {
        this.history = history;
    }
}
