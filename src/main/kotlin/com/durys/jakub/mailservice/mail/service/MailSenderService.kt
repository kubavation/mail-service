package com.durys.jakub.mailservice.mail.service

interface MailSenderService<in T> {

     fun send(message: T)
}