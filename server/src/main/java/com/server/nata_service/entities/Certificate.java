package com.server.nata_service.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "certificate")
public class Certificate {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(50)")
    private String name;

    @ManyToOne
    @JoinColumn(name = "employee_certificate_id", nullable = false)
    private Employee employee;

    public Certificate() {}

    public Certificate(Long id, String name, Employee employee) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Certificate certificate = (Certificate) o;
        return Objects.equals(id, certificate.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
