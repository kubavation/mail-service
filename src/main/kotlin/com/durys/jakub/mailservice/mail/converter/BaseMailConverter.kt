package com.durys.jakub.mailservice.mail.converter

import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import org.springframework.mail.MailMessage
import org.springframework.mail.SimpleMailMessage

class BaseMailConverter: MailConverter<BaseMailDTO, MailMessage> {

    override fun convert(t: BaseMailDTO): MailMessage {
        var message = SimpleMailMessage()
        message.setTo(t.destination)
        message.setSubject(t.title)
        message.setText(t.content)
        return message
    }
}