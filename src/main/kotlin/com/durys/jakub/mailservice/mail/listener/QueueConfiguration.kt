package com.durys.jakub.mailservice.mail.listener

import org.springframework.amqp.core.Queue
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class QueueConfiguration {

    @Bean
    fun notificationQueue(@Value("\${q.mail-queue}") mailQueue: String) = Queue(mailQueue)

    @Bean
    fun converter() = Jackson2JsonMessageConverter()
}