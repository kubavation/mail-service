package com.durys.jakub.mailservice.mail.service

import org.springframework.mail.MailMessage

interface MailSenderService<in T> {

     fun send(message: T)

}