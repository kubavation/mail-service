package com.durys.jakub.mailservice.mail.service

import com.durys.jakub.mailservice.mail.converter.BaseMailConverter
import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Service

@Service
class MailService(private val mailSenderService: MailSenderService<SimpleMailMessage>) {

    private val baseMailConverter = BaseMailConverter()

    fun convertAndSend(mailDTO: BaseMailDTO) {
        val mail = baseMailConverter.convert(mailDTO)
        mailSenderService.send(mail)
    }

}