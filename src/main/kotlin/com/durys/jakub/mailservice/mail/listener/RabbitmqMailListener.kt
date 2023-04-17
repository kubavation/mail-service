package com.durys.jakub.mailservice.mail.listener

import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class RabbitmqMailListener: MailListener {

    @RabbitListener(queues = ["\${q.mail-queue}"])
    override fun send(mail: BaseMailDTO) {
        //todo
    }
}