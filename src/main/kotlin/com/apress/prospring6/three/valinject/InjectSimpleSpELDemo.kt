package com.apress.prospring6.three.valinject

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component

@Component("injectSimpleSpEL")
class InjectSimpleSpELDemo {
    @Value("#{injectSimpleConfig.name.toUpperCase()}")
    private val name: String? = null

    @Value("#{injectSimpleConfig.age + 1}")
    private val age = 0

    @Value("#{injectSimpleConfig.height}")
    private val height = 0f

    @Value("#{injectSimpleConfig.developer}")
    private val developer = false

    @Value("#{injectSimpleConfig.ageInSeconds}")
    private val ageInSeconds: Long? = null
    override fun toString(): String {
        return """ 
            Name: $name
            Age: $age
            Age in Seconds: $ageInSeconds
            Height: $height
            Is Developer?: $developer
        """.trimIndent()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ctx = AnnotationConfigApplicationContext()
            ctx.register(InjectSimpleConfig::class.java, InjectSimpleSpELDemo::class.java)
            ctx.refresh()
            val simple = ctx.getBean("injectSimpleSpEL") as InjectSimpleSpELDemo
            println(simple)
        }
    }
}