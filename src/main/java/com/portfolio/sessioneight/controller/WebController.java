package com.portfolio.sessioneight.controller;

import com.portfolio.sessioneight.model.*;
import com.portfolio.sessioneight.utility.MailHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;

@Controller
public class WebController {

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping(value = "/")
    public String index(Model model){

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setName("James Lacen");
        personalInfo.setAddress("Dallas, Texas");
        personalInfo.setAge(35);
        personalInfo.setDescription("I help you build brand for your business at an affordable price. Thousands of clients have procured exceptional results while working with our dedicated team. when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        personalInfo.setEmail("jlacen2355@hotmail.com");
        personalInfo.setPhoneNumber("9729877383");
        personalInfo.setCvURL("https://drive.google.com/file/d/1yfxvFaETTGexFePvULQtopgQxSisrdBe/view?usp=sharing");

        ArrayList<PortfolioService> services = new ArrayList<>();
        services.add(new PortfolioService("Web App Development", "Create web application using spring boot", ""));
        services.add(new PortfolioService("Mobile App Development", "Create mobil application using java", ""));
        services.add(new PortfolioService("Digital Business Development", "Create Web based business", ""));
        services.add(new PortfolioService("Website Integrations", "Design custom program for business sites", ""));

        Collections.sort(services);

        ArrayList<MyEducation> myEducations = new ArrayList<>();
        myEducations.add(new MyEducation("2005-2015", "Computer Science Engineer", "Interamerican University", "Bachelor in hardware and software Sciences"));
        myEducations.add(new MyEducation("2015-2018", "Network Analyst", "Interamerican University", "Certification in Network programming"));
        myEducations.add(new MyEducation("2019-2022", "Java Developer", "Vastika University", "Trainning in Java programming language and web software"));

        ArrayList<MyExperience> myExperiences = new ArrayList<>();
        myExperiences.add(new MyExperience("2012-2015", "IT Technician", "Pueblo Inc.", "Data Center maintanance"));
        myExperiences.add(new MyExperience("2015-2019", "Web Developer", "Google", "Android online School plataform programmer"));
        myExperiences.add(new MyExperience("2020-2022", "Network Enginner", "Conexion One Corp.", "Assambling network hardware and basic configuration of devices"));

        ArrayList<MySkill> mySkills = new ArrayList<>();
        mySkills.add(new MySkill("Angular", "80"));
        mySkills.add(new MySkill("Visual Basic", "20"));
        mySkills.add(new MySkill("C++", "60"));
        mySkills.add(new MySkill("Java/JavaScript", "50"));
        mySkills.add(new MySkill("Python", "30"));
        mySkills.add(new MySkill("React", "70"));

        Collections.sort(mySkills);

        model.addAttribute("personal", personalInfo);
        model.addAttribute("services", services);
        model.addAttribute("educations", myEducations);
        model.addAttribute("experiences", myExperiences);
        model.addAttribute("skills", mySkills);

        return "index";
    }

    @PostMapping(value = "/contact")
    public String contact(@ModelAttribute Contact contact){

        System.out.println("This is getting called");
        System.out.println(contact);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ");
        stringBuilder.append(contact.getName());
        stringBuilder.append("\n");
        stringBuilder.append("Email: ");
        stringBuilder.append(contact.getEmail());
        stringBuilder.append("\n");
        stringBuilder.append("Messageg: ");
        stringBuilder.append(contact.getMessage());
        stringBuilder.append("\n");


        MailHelper.sendTextEmail(stringBuilder.toString(), javaMailSender, "Email From your personal website", "jlacen2355@gmail.com");



        //Sending email
        return "redirect:";
    }

}
