package com.example.restfulPet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ResTfulPetApplication

fun main(args: Array<String>) {
	runApplication<ResTfulPetApplication>(*args)
}
data class Message(val id: String?, val text: String)

