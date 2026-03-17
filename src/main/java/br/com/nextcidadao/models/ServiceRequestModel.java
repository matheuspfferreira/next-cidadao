package br.com.nextcidadao.models;

import br.com.nextcidadao.models.enums.ServiceCategory;
import br.com.nextcidadao.models.enums.ServicePriority;

import java.util.List;

public class ServiceRequestModel {
    private Integer id;
    private Integer description;
    private ServiceCategory category;
    private ServicePriority priority;
    private String location;
    private List<ServiceHistoryModel> history;

    public ServiceRequestModel(Integer id, Integer description, ServiceCategory category, ServicePriority priority,
                               String location, List<ServiceHistoryModel> history) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.location = location;
        this.history = history;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
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
