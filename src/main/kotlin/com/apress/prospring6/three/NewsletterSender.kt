package com.apress.prospring6.three

interface NewsletterSender {
    var smtpServer: String?
    var fromAddress: String?

    fun send()
}