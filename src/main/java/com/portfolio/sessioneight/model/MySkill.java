package com.portfolio.sessioneight.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MySkill implements Comparable<MySkill>{

    @Getter
    private String title;
    @Getter
    private String capacity;

    @Override
    public int compareTo(MySkill o) {
        return this.title.compareTo(o.title);
    }
}
