package com.durys.jakub.mailservice.mail.listener

import com.durys.jakub.mailservice.mail.model.BaseMailDTO

internal interface MailListener {
    fun send(mail: BaseMailDTO)
}