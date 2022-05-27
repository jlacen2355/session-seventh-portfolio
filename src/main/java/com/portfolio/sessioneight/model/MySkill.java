package com.portfolio.sessioneight.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_myskill")
@Table
public class MySkill implements Comparable<MySkill>{

    public MySkill(String title, String capacity) {
        this.title = title;
        this.capacity = capacity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Getter
    @Column
    private String title;

    @Getter
    @Column
    private String capacity;

    @Override
    public int compareTo(MySkill o) {
        return this.title.compareTo(o.title);
    }
}
