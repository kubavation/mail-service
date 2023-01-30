package com.durys.jakub.mailservice.mail.converter

internal interface MailConverter<in T, out R> {
   infix fun convert(t: T): R
}