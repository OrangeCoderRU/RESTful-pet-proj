package com.example.restfulPet

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

class MessageController {
    @RestController
    class MessageResource {
        @GetMapping
        fun index(): List<Message> = listOf(
            Message("1", "Hello!"),
            Message("2", "Bonjour!"),
            Message("3", "Privet!"),
        )
    }
}