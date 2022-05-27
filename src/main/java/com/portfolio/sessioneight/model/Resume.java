package com.portfolio.sessioneight.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_resume")
@Table
@Data
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Getter
    @Column
    private String years;

    @Getter
    @Column
    private String title;

    @Getter
    @Column
    private String subtitle;

    @Getter
    @Column
    private String description;

    public Resume(String years, String title, String subtitle, String description) {
    }
}
