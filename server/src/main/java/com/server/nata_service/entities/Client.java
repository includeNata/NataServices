package com.server.nata_service.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "client")
public class Client {


    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String name;

    @Column(columnDefinition = "varchar(45)" ,unique = true ,nullable = false)
    private String email;

    @Column(columnDefinition = "varchar(35)" ,nullable = false)
    private String password;

    @OneToMany(mappedBy = "client")
    private List<FeedBack> feedBacks = new ArrayList<>();

    @OneToMany(mappedBy = "contractor")
    private List<Work> works = new ArrayList<>();
    public Client() {
    }

    public Client(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public List<Work> getWorks() {
        return works;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
