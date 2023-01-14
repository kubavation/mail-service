package com.durys.jakub.mailservice.mail.service

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender

class SpringMailSenderService(private val mailSender: JavaMailSender, private val from: String)
    : MailSenderService<SimpleMailMessage> {

    override fun send(message: SimpleMailMessage) {
        message.setFrom(from)
        mailSender.send(message)
    }

}