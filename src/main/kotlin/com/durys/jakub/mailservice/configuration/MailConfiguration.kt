package com.durys.jakub.mailservice.configuration

import com.durys.jakub.mailservice.mail.service.MailSenderService
import com.durys.jakub.mailservice.mail.service.SpringMailSenderService
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
internal class MailConfiguration(@Value("\${mail-host}") private val host: String,
                        @Value("\${mail-port}") private val port: Int,
                        @Value("\${mail-username}") private val username: String,
                        @Value("\${mail-password}") private val password: String) {



    @Bean
    fun mailSender(): JavaMailSender {
        val mailSender = JavaMailSenderImpl()
        mailSender.host = host
        mailSender.port = port
        mailSender.username = username
        mailSender.password = password

        mailSender.javaMailProperties.setProperty("mail.transport.protocol", "smtp")
        mailSender.javaMailProperties.setProperty("mail.smtp.auth", "true")
        mailSender.javaMailProperties.setProperty("mail.debug", "true")
        return mailSender
    }

    @Bean
    fun mailSenderService(mailSender: JavaMailSender): MailSenderService<SimpleMailMessage> {
        return SpringMailSenderService(mailSender, username);
    }

}