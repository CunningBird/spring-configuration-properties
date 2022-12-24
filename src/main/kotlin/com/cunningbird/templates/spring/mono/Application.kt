package com.cunningbird.templates.spring.mono

import com.cunningbird.templates.spring.mono.config.UtkaGatewayConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(UtkaGatewayConfig::class)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
