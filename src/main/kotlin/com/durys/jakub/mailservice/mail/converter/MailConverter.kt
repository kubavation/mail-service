package com.durys.jakub.mailservice.mail.converter

internal interface MailConverter<in T, out R> {
   fun convert(t: T): R
}