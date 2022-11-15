package com.durys.jakub.mailservice.mail.converter

import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import org.springframework.mail.SimpleMailMessage

class BaseMailConverter: MailConverter<BaseMailDTO, SimpleMailMessage> {

    override fun convert(t: BaseMailDTO): SimpleMailMessage {
        val message = SimpleMailMessage()
        message.setTo(t.destination)
        message.setSubject(t.title)
        message.setText(t.content)
        return message
    }
}