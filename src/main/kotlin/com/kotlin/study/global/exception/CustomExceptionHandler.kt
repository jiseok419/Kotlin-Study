package com.kotlin.study.global.exception

import com.kotlin.study.global.response.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class CustomExceptionHandler {

    @ExceptionHandler(CustomException::class)
    fun customHandle(e : CustomException) : ResponseEntity<Response> {
        return ResponseEntity(
            Response(
                e.status,
                e.message
            ),
            e.status
        )
    }
}