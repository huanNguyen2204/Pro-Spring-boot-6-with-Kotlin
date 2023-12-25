package com.apress.prospring6.three.setter

import com.apress.prospring6.two.decoupled.MessageProvider
import com.apress.prospring6.two.decoupled.MessageRenderer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("renderer")
class StandardOutMessageRenderer @Autowired constructor(
    override var messageProvider: MessageProvider?
) : MessageRenderer {
    init {
        println("~~ Injecting dependency using constructor ~~")
    }
}