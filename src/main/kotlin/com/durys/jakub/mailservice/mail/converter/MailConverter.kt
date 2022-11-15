package com.durys.jakub.mailservice.mail.converter

interface MailConverter<in T, out R> {
   fun convert(t: T): R
}