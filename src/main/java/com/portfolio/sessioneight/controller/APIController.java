package com.portfolio.sessioneight.controller;

import com.portfolio.sessioneight.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@RestController
public class APIController {

    @GetMapping(value = "/api/test")
    public HashMap<String, Object> test(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "James Lacen");
        map.put("email", "vastikajavaclass2022@gmail.com");
        map.put("age", 30);
        map.put("isActive", true);

        HashMap<String, String> another = new HashMap<>();
        another.put("test", "inside another");
        map.put("another", another);


        return map;
    }

    @GetMapping(value = "/api/test1")
    public PersonalInfo test1(){
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setName("James Lacen");
        personalInfo.setAddress("Dallas, Texas");
        personalInfo.setAge(35);
        personalInfo.setDescription("I help you build brand for your business at an affordable price. Thousands of clients have procured exceptional results while working with our dedicated team. when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        personalInfo.setEmail("jlacen2355@hotmail.com");
        personalInfo.setPhoneNumber("9729877383");
        personalInfo.setCvURL("https://drive.google.com/file/d/1yfxvFaETTGexFePvULQtopgQxSisrdBe/view?usp=sharing");
        personalInfo.setAnother(new Another());

        return personalInfo;
    }

    @GetMapping(value = "/api/llcservices")
    public ArrayList<PorfolioService> llcservices(){
        ArrayList<PorfolioService> services = new ArrayList<>();
        services.add(new PorfolioService("Web App Development", "Create web application using spring boot", ""));
        services.add(new PorfolioService("Mobile App Development", "Create mobil application using java", ""));
        services.add(new PorfolioService("Digital Business Development", "Create Web based business", ""));
        services.add(new PorfolioService("Website Integrations", "Design custom program for business sites", ""));

        Collections.sort(services);

        return services;
    }

    @GetMapping(value = "/api/education")
    public ArrayList<MyEducation> education(){
        ArrayList<MyEducation> myEducations = new ArrayList<>();
        myEducations.add(new MyEducation("2005-2015", "Computer Science Engineer", "Interamerican University", "Bachelor in hardware and software Sciences"));
        myEducations.add(new MyEducation("2015-2018", "Network Analyst", "Interamerican University", "Certification in Network programming"));
        myEducations.add(new MyEducation("2019-2022", "Java Developer", "Vastika University", "Trainning in Java programming language and web software"));

        return myEducations;
    }

    @GetMapping(value = "/api/experience")
    public ArrayList<MyExperience> experience(){
        ArrayList<MyExperience> myExperiences = new ArrayList<>();
        myExperiences.add(new MyExperience("2012-2015", "IT Technician", "Pueblo Inc.", "Data Center maintanance"));
        myExperiences.add(new MyExperience("2015-2019", "Web Developer", "Google", "Android online School plataform programmer"));
        myExperiences.add(new MyExperience("2020-2022", "Network Enginner", "Conexion One Corp.", "Assambling network hardware and basic configuration of devices"));

        return myExperiences;
    }

    @GetMapping(value = "/api/myskills")
    public HashMap<String, Object> myskills(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("Angular", "80");
        map.put("Visual Basic", "20");
        map.put("C++", "60");
        map.put("Java/JavaScript", "50");
        map.put("Python", "30");
        map.put("React", "70");

        return map;
    }
}
