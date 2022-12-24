package com.cunningbird.templates.spring.mono.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "utka-gateway")
data class UtkaGatewayConfig(
    val clients: Map<String, UtkaClient>
)