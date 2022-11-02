package com.example.kotlinfees.controller


import com.example.kotlinfees.Message
import com.example.kotlinfees.services.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val service: MessageService) {
  /* fun index(@RequestParam("name") name: String) = "Hello, $name!"
    @GetMapping
    fun index() = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    ) */
    @GetMapping
    fun index(): List<Message> = service.findMessages();

    @PostMapping
    fun post(@RequestBody message: Message){
        service.save(message)
    }

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> =
      service.findMessageById(id)

}
