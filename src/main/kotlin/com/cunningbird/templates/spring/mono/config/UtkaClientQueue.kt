package com.cunningbird.templates.spring.mono.config

data class UtkaClientQueue(
    val inbound: String,
    val outbound: String?,
    val route: String,
)