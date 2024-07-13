package com.server.nata_service.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(40)",nullable = false)
    private String name;

    @Column(columnDefinition = "varchar(45)" ,unique = true ,nullable = false)
    private String email;

    @Column(columnDefinition = "varchar(25)",nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate birthday;

    @Column(columnDefinition = "varchar(30)")
    private String photo;
    @OneToMany(mappedBy = "employee")
    private List<FeedBack> feedBacks = new ArrayList<>();
    @OneToMany(mappedBy = "contracted")
    private List<Work> works = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id" , referencedColumnName = "id")
    private Skill skill;

    public Employee() {
    }

    public Employee(Long id, String name, String email, String password, LocalDate birthday, String photo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.photo = photo;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
