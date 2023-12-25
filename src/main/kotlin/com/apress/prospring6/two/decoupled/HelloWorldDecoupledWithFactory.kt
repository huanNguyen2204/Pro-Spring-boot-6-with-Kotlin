package com.apress.prospring6.two.decoupled

object HelloWorldDecoupledWithFactory {
    @JvmStatic
    fun main(args: Array<String>) {
        val mr: MessageRenderer = MessageSupportFactory.renderer?:
            throw IllegalArgumentException("Service of type 'MessageRerender' was not found")
        val mp: MessageProvider = MessageSupportFactory.provider?:
            throw IllegalArgumentException("Service of type 'MessageProvider' was not found")
        mr.messageProvider = mp
        mr.render()
    }
}