package com.portfolio.sessioneight.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class Resume {

    @Getter
    private String years;
    @Getter
    private String title;
    @Getter
    private String subtitle;
    @Getter
    private String description;
}
