package com.apress.prospring6.three

import com.apress.prospring6.two.decoupled.MessageProvider
import com.apress.prospring6.two.decoupled.MessageRenderer

class StandardOutMessageRenderer: MessageRenderer {
    override var messageProvider: MessageProvider? = null
    override fun render() {}
}