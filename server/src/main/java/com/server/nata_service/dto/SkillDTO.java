package com.server.nata_service.dto;

import com.server.nata_service.entities.Skill;

public class SkillDTO {

    private String area;
    private String certificate;
    private String description;
    private String formation;
    private String technology;

    public SkillDTO() {
    }

    public SkillDTO(String area, String certificate, String description, String formation, String technology) {
        this.area = area;
        this.certificate = certificate;
        this.description = description;
        this.formation = formation;
        this.technology = technology;
    }

    public SkillDTO(Skill skill) {
        this.area = skill.getArea();
        this.certificate = skill.getCertificate();
        this.description = skill.getDescription();
        this.formation = skill.getFormation();
        this.technology = skill.getTechnology();
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
