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
    private LocalDate birthday;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, String email, String photo) {
        this.name = name;
        this.email = email;
        this.photo = photo;

    }

    public EmployeeDTO(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
        this.email = employee.getEmail();
        this.photo = employee.getPhoto();
        this.birthday = employee.getBirthday();
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

    public LocalDate getBirthday() {
        return birthday;
    }
}
