package com.server.nata_service.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "technology")
public class Technology {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50)")
    private String name;

    @ManyToOne
    @JoinColumn(name = "employee_technology_id", nullable = false)
    private Employee employee;

    public Technology() {}

    public Technology(Long id, String name, Employee employee) {
        this.id = id;
        this.name = name;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technology technology = (Technology) o;
        return Objects.equals(id, technology.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}