package com.example.kotlinfees.repository

import com.example.kotlinfees.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository <Message, String> {
}