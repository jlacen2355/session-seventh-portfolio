package com.portfolio.sessioneight.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity(name = "tbl_myeducation")
@Table
public class MyEducation extends Resume{

    public MyEducation(String years, String title, String subtitle, String description) {
        super(years, title, subtitle, description);

        MyEducation myEducation = new MyEducation();
        myEducation.getYears();
        myEducation.getTitle();
        myEducation.getSubtitle();
        myEducation.getDescription();
    }

}
