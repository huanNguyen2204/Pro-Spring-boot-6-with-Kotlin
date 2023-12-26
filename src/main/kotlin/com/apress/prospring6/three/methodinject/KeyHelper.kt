package com.apress.prospring6.three.methodinject

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component("keyHelper")
@Scope("prototype")
class KeyHelper {
    fun open() {

    }
}