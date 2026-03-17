package br.com.nextcidadao.models;

import br.com.nextcidadao.models.enums.ServiceStatus;

import java.time.LocalDateTime;

public class ServiceHistoryModel {
    private Integer id;
    private String description;
    private ResponsibleModel responsible;
    private ServiceStatus status;
    private LocalDateTime createdAt;

    public ServiceHistoryModel(Integer id, String description, ResponsibleModel responsible, ServiceStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.description = description;
        this.responsible = responsible;
        this.status = status;
        this.createdAt = createdAt;
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

    public ResponsibleModel getResponsible() {
        return responsible;
    }

    public void setResponsible(ResponsibleModel responsible) {
        this.responsible = responsible;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
