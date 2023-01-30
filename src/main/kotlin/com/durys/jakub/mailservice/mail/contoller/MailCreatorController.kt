package com.durys.jakub.mailservice.mail.contoller

import com.durys.jakub.mailservice.mail.model.BaseMailDTO
import com.durys.jakub.mailservice.mail.service.MailService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mails")
internal class MailCreatorController(private val mailService: MailService) {

    @PostMapping
    fun create(@RequestBody baseMail: BaseMailDTO) = mailService.convertAndSend(baseMail)

}