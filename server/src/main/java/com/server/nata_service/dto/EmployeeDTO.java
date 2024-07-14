package com.server.nata_service.dto;

import com.server.nata_service.entities.Employee;
import com.server.nata_service.entities.FeedBack;
import com.server.nata_service.entities.Skill;
import com.server.nata_service.entities.Work;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;
    private String photo;
    private String password;
    private LocalDate birthday;
    private Skill skill;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, String email, String photo, String password, LocalDate birthday, Skill skill) {
        this.name = name;
        this.email = email;
        this.photo = photo;
        this.password = password;
        this.birthday = birthday;
        this.skill = skill;
    }

    public EmployeeDTO(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
        this.email = employee.getEmail();
        this.photo = employee.getPhoto();
        this.password = employee.getPassword();
        this.birthday = employee.getBirthday();
        this.skill = employee.getSkill();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Skill getSkill() {
        return skill;
    }
}
