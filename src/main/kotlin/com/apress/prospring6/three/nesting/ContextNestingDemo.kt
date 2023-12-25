package com.apress.prospring6.three.nesting

import org.springframework.context.annotation.AnnotationConfigApplicationContext

object ContextNestingDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val parentCtx = AnnotationConfigApplicationContext()
        parentCtx.register(ParentConfig::class.java)
        parentCtx.refresh()
        val childCtx = AnnotationConfigApplicationContext()
        childCtx.register(ChildConfig::class.java)
        childCtx.parent = parentCtx
        childCtx.refresh()
        val song1: Song = childCtx.getBean("song1") as Song
        val song2: Song = childCtx.getBean("song2") as Song
        val song3: Song = childCtx.getBean("song3") as Song
        println("from parent ctx: " + song1.title)
        println("from parent ctx: " + song2.title)
        println("from child ctx: " + song3.title)
    }
}