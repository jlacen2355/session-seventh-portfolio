package com.portfolio.sessioneight.utility;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailHelper {

    public static void sendTextEmail(String message, JavaMailSender javaMailSender){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("jlacen2355@hotmail.com");

        simpleMailMessage.setSubject("Email From your personal website");

        simpleMailMessage.setText(message);

        try {
            javaMailSender.send(simpleMailMessage);
        }catch (MailException exception){
            exception.printStackTrace();
        }
    }
}
