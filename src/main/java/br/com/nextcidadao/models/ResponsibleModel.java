package br.com.nextcidadao.models;

import br.com.nextcidadao.models.enums.ResponsiblePosition;

public class ResponsibleModel {
    private Integer id;
    private String name;
    private ResponsiblePosition position;

    public ResponsibleModel(Integer id, String name, ResponsiblePosition position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponsiblePosition getPosition() {
        return position;
    }

    public void setPosition(ResponsiblePosition position) {
        this.position = position;
    }
}
