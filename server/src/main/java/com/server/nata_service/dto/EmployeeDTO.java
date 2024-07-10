package com.server.nata_service.dto;

import com.server.nata_service.entities.Employee;
import com.server.nata_service.entities.FeedBack;
import com.server.nata_service.entities.Skill;
import org.hibernate.jdbc.Work;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    private String photo;
    private List<FeedBack> feedBacks = new ArrayList<>();
    private List<Work> works = new ArrayList<>();
    private Skill skill;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long id, String name, String email, String password, LocalDate birthday, String photo, List<FeedBack> feedBacks, List<Work> works, Skill skill) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.photo = photo;
        this.feedBacks = feedBacks;
        this.works = works;
        this.skill = skill;
    }

    public EmployeeDTO(Employee entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        password = entity.getPassword();
        birthday = entity.getBirthday();
        photo = entity.getPhoto();
        feedBacks = entity.getFeedBacks();
        works = entity.getWorks();
        skill = entity.getSkill();
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

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getPhoto() {
        return photo;
    }

    public List<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public List<Work> getWorks() {
        return works;
    }

    public Skill getSkill() {
        return skill;
    }
}