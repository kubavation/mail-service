package com.durys.jakub.mailservice.mail.service

internal interface MailSenderService<in T> {
     fun send(message: T)
}