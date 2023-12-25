package com.apress.prospring6.three.valinject

import org.springframework.stereotype.Component

@Component("injectSimpleConfig")
internal class InjectSimpleConfig {
    val name = "Huan Nguyen"
    val age = 40
    val height = 1.92f
    val isDeveloper = false
    val ageInSeconds = 1241401112L
}