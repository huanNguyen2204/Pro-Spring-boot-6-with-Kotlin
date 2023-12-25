package com.apress.prospring6.two

object HelloWorldWithCommandLine2 {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size > 0) {
            println(args[0])
        } else {
            println("Hello World")
        }
    }
}