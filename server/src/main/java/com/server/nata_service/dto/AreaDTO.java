package com.server.nata_service.dto;

import com.server.nata_service.entities.Area;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AreaDTO {

    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 1, max = 20, message = "Name must be between 1 and 20 characters")
    private String name;

    public AreaDTO() {
    }

    public AreaDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AreaDTO(Area area) {
        this.id = area.getId();
        this.name = area.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
