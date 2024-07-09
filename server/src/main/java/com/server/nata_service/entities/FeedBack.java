package com.server.nata_service.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "feedback")
public class FeedBack {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String text;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;


    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;

    public FeedBack() {
    }

    public FeedBack(Long id, String text, LocalDate date, Client client, Employee employee) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.client = client;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedBack feedBack = (FeedBack) o;
        return Objects.equals(id, feedBack.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
