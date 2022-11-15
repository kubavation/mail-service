package com.durys.jakub.mailservice.mail.service

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class SpringMailSenderService(private val mailSender: JavaMailSender): MailSenderService<SimpleMailMessage> {


    override fun send(message: SimpleMailMessage) {
        message.setFrom("external_cm@int.pl")
//        message.setTo("kubavation@wp.pl")
//        message.setSubject("TEST")
//        message.setText("TEST")
        mailSender.send(message)
    }


}