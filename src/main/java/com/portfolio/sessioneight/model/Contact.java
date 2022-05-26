package com.portfolio.sessioneight.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "tbl_contact")
@Table
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String message;
}
