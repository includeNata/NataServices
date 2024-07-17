package com.server.nata_service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Table(name = "skill")
public class Skill {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(20)")
    private String area;

    @Column(columnDefinition = "varchar(20)")
    private String formation;

    @Column(columnDefinition = "varchar(20)")
    private String certificate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "varchar(20)")
    private String technology;

    @OneToOne(mappedBy = "skill")
    private Employee employee;

    public Skill() {
    }

    public Skill(Long id, String area, String formation, String certificate, String description, String technology) {
        this.id = id;
        this.area = area;
        this.formation = formation;
        this.certificate = certificate;
        this.description = description;
        this.technology = technology;
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

    public String getFormation() {
        return formation;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setFormation(String formation) {
        this.formation = formation;
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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(id, skill.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
