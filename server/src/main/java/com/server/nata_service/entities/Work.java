package com.server.nata_service.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "work")
public class Work {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(20)")
    private String name;

    @Column(nullable = false)
    private LocalDateTime date_start;

    @Column(nullable = false)
    private LocalDateTime date_end;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client contractor;


    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee contracted;

    public Work() {
    }

    public Work(Long id, String name, LocalDateTime date_start, LocalDateTime date_end, Client contractor, Employee contracted) {
        this.id = id;
        this.name = name;
        this.date_start = date_start;
        this.date_end = date_end;
        this.contractor = contractor;
        this.contracted = contracted;
    }

    public Long getId() {
        System.out.println("remove");
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

    public LocalDateTime getDate_start() {
        return date_start;
    }

    public void setDate_start(LocalDateTime date_start) {
        this.date_start = date_start;
    }

    public LocalDateTime getDate_end() {
        return date_end;
    }

    public void setDate_end(LocalDateTime date_end) {
        this.date_end = date_end;
    }

    public Client getContractor() {
        return contractor;
    }

    public void setContractor(Client contractor) {
        this.contractor = contractor;
    }

    public Employee getContracted() {
        return contracted;
    }

    public void setContracted(Employee contracted) {
        this.contracted = contracted;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work work = (Work) o;
        return Objects.equals(id, work.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
