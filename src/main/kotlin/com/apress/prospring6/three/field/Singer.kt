package com.apress.prospring6.three.field

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("singer")
internal class Singer {
    @Autowired
    private val inspirationBean: Inspiration? = null

    fun sing() {
        println("... " + inspirationBean!!.lyric)
    }
}