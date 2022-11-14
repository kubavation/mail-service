package com.durys.jakub.mailservice.mail.service

interface MailSenderService {

     fun <T> send(message: T)
}