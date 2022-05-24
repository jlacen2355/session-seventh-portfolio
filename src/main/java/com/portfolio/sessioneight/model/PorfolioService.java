package com.portfolio.sessioneight.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PorfolioService  implements Comparable<PorfolioService>{

    @Getter
    private String serviceName;
    @Getter
    private String serviceDescription;
    @Getter
    private String serviceIcon;

    @Override
    public int compareTo(PorfolioService o) {
        return this.serviceName.compareTo(o.serviceName);
    }
}
