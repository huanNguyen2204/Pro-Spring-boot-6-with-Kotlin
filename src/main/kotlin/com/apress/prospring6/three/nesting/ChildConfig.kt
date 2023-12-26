package com.apress.prospring6.three.nesting

import org.apache.catalina.core.ApplicationContext
import org.springframework.beans.BeansException
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ChildConfig: ApplicationContextAware {
    var applicationContext1: ApplicationContext? = null

    @Bean
    open fun childProvider(): TitleProvider {
        return TitleProvider().instance("No Such Thing")
    }

    @Bean
    open fun song1(@Value("#parentProvider.title") title: String?): Song {
        return Song(title)
    }

    @Bean
    open fun song2(@Value("#{childConfig.applicationContext1.parent.getBean(`"childProvider"`).title}")
        title: String?
    ) : Song {
        return Song(title)
    }

    @Bean
    open fun song3(@Value("#{childProvider.title}") title: String? ): Song {
        return Song(title)
    }

    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: org.springframework.context.ApplicationContext) {
        this.applicationContext1 = applicationContext1
    }
}