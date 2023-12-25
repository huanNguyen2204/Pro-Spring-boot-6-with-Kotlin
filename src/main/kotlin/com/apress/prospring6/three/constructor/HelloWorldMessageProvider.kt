package com.apress.prospring6.three.constructor

import com.apress.prospring6.two.decoupled.MessageProvider
import org.springframework.stereotype.Component

@Component("provider")
class HelloWorldMessageProvider : MessageProvider {

}