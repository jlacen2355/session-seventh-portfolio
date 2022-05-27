package com.portfolio.sessioneight.model;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity (name = "tbl_personalinfo")
@Table
public class PersonalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private int age;

    @Column
    private String address;

    @Column(name = "cv_url")
    private String cvURL;

    @Column
    private String description;

    @Column(name = "phone_Number")
    private String phoneNumber;

}
