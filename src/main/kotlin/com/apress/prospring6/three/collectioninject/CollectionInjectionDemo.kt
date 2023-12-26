package com.apress.prospring6.three.collectioninject

import com.apress.prospring6.three.nesting.Song
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component
import java.util.Properties

object CollectionInjectionDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val ctx = AnnotationConfigApplicationContext()
        ctx.register(CollectionConfig::class.java, CollectingBean::class.java)
        ctx.refresh()
        val collectingBean = ctx.getBean(CollectingBean::class.java)
        collectingBean.printCollections()
    }
}

@Component
internal class CollectingBean {
    @Autowired
    @Qualifier
    var songListResource: List<Song>? = null

    @Autowired
    var songList: List<Song>? = null

    @Autowired
    var songSet: Set<Song>? = null

    @Autowired
    @Qualifier("set")
    var songSetResouce: Set<Song>? = null

    @Autowired
    @Qualifier
    var songMapResource: Map<String, Song>? = null

    @Autowired
    var props: Properties? = null
    fun printCollections() {

    }
}