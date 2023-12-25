package com.apress.prospring6.two.decoupled

interface MessageRenderer {
    fun render()
    var messageProvider: MessageProvider?
}