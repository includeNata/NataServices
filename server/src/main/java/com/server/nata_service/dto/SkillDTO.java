package com.server.nata_service.dto;

import com.server.nata_service.entities.Skill;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SkillDTO {

    private Long id;



    @Size(min = 1, max = 20, message = "Area must be between 1 and 20 characters")
    private String area;

    @Size(min = 1, max = 20, message = "Certificate must be between 1 and 20 characters")
    private String certificate;

    @Size(min = 1, max = 255, message = "Description must be between 1 and 255 characters")
    private String description;

    @Size(min = 1, max = 20, message = "Formation must be between 1 and 20 characters")
    private String formation;

    @Size(min = 1, max = 20, message = "Technology must be between 1 and 20 characters")
    private String technology;

    public SkillDTO() {
    }

    public SkillDTO(Long id, String area, String certificate, String description, String formation, String technology) {
        this.id = id;
        this.area = area;
        this.certificate = certificate;
        this.description = description;
        this.formation = formation;
        this.technology = technology;
    }

    public SkillDTO(Skill skill) {
        this.id = skill.getId();
        this.area = skill.getArea();
        this.certificate = skill.getCertificate();
        this.description = skill.getDescription();
        this.formation = skill.getFormation();
        this.technology = skill.getTechnology();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
