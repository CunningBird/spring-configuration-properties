package com.cunningbird.templates.spring.mono.listener

import com.cunningbird.templates.spring.mono.config.UtkaGatewayConfig
import org.springframework.stereotype.Component

@Component
class GatewayListener(
    config: UtkaGatewayConfig
) {

    init {
        config.clients.forEach { (clientName, client) ->
            client.queues.forEach { (queueName, queue) ->
                // TODO setup listener
            }
        }
    }
}