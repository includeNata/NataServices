package com.server.nata_service.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "certificate")
public class Certificate {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(20)")
    private String name;

    public Certificate() {}

    public Certificate(Long id, String name) {
        this.id = id;
        this.name = name;
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
