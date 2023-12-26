package com.apress.prospring6.three.collectioninject

import com.apress.prospring6.three.nesting.Song
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.Properties

@Configuration
internal open class CollectionConfig {
    @Bean
    open fun list(): List<Song> {
        return listOf(
            Song("Not the end"),
            Song("Riseup")
        )
    }

    @Bean
    open fun set(): Set<Song> {
        return setOf(
            Song("Ordinary Day"),
            Song("Birds Fly")
        )
    }

    @Bean
    open fun props(): Properties {
        val props = Properties()
        props["said.he"] = "Never mine"
        props["said.she"] = "Cold and jaded"
        return props
    }

    @Bean
    open fun song1(): Song {
        return Song("Here's to hoping")
    }

    @Bean
    open fun song2(): Song {
        return Song("Wishing the best for you")
    }
}