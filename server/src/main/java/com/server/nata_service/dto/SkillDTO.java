package com.server.nata_service.dto;

import com.server.nata_service.entities.Skill;

public class SkillDTO {
    private Long id;
    private String description;
    private Long areaId;
    private Long certificateId;
    private Long formationId;
    private Long technologyId;

    public SkillDTO() {
    }

    public SkillDTO(Long id, String description, Long areaId, Long certificateId, Long formationId, Long technologyId) {
        this.id = id;
        this.description = description;
        this.areaId = areaId;
        this.certificateId = certificateId;
        this.formationId = formationId;
        this.technologyId = technologyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
    }

    public Long getFormationId() {
        return formationId;
    }

    public void setFormationId(Long formationId) {
        this.formationId = formationId;
    }

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }
}
