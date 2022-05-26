package com.portfolio.sessioneight.model;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_portfolio_service")
@Table
public class PorfolioService  implements Comparable<PorfolioService>{

    public PorfolioService(String serviceName, String serviceDescription, String serviceIcon) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceIcon = serviceIcon;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Getter
    @Column(name = "service_name")
    private String serviceName;
    @Getter
    @Column(name = "service_description")
    private String serviceDescription;
    @Getter
    @Column(name = "service_icon")
    private String serviceIcon;

    @Override
    public int compareTo(PorfolioService o) {
        return this.serviceName.compareTo(o.serviceName);
    }
}
