package com.durys.jakub.mailservice.mail.listener

import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import com.durys.jakub.mailservice.mail.service.MailService
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
internal class RabbitmqMailListener(private val mailService: MailService): MailListener {

    @RabbitListener(queues = ["\${q.mail-queue}"])
    override fun send(mail: BaseMailDTO) =mailService.convertAndSend(mail)
}