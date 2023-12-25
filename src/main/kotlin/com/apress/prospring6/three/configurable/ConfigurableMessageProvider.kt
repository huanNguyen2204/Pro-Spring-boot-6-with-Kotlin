package com.apress.prospring6.three.configurable

import com.apress.prospring6.two.decoupled.MessageProvider
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component("provider")
internal class ConfigurableMessageProvider(
    @Value("Configurable message") override var message: String
): MessageProvider {
    init {
        println("~~ Injecting '$message' value into constructor ~~")
        this.message = message
    }
}