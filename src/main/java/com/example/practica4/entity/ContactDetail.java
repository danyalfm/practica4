package com.example.practica4.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "contactDetal")
public class ContactDetail {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="gender")
    private int gender;

    @Column(name="dateOfBirth")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "contactId")
    private Contact contact;

    private ContactDetail(int id, int gender, Date dateOfBirth, Contact contact){
        this.id = id;
        this.gender = gender;
        this.dateOfBirth= dateOfBirth;
        this.contact = contact;
    }
}

