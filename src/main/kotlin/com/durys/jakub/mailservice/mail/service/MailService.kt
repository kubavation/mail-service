package com.durys.jakub.mailservice.mail.service

import com.durys.jakub.mailservice.mail.converter.BaseMailConverter
import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Service

@Service
internal class MailService(private val mailSenderService: MailSenderService<SimpleMailMessage>) {

    fun convertAndSend(mailDTO: BaseMailDTO) {
        val mail = BaseMailConverter.convert(mailDTO)
        mailSenderService.send(mail)
    }

}