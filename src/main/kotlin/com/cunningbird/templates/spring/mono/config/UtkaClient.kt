package com.cunningbird.templates.spring.mono.config

data class UtkaClient(
    val address: String,
    val virtualHost: String,
    val username: String,
    val password: String,
    val queues: Map<String, UtkaClientQueue>
)