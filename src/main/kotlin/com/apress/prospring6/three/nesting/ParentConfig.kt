package com.apress.prospring6.three.nesting

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ParentConfig {
    @Bean
    open fun parentProvider(): TitleProvider {
        return TitleProvider().instance(null)
    }

    @Bean
    open fun childProvider(): TitleProvider {
        return TitleProvider().instance("Daughters")
    }
}