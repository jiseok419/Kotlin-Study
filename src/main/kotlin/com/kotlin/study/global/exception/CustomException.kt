package com.kotlin.study.global.exception

import org.springframework.http.HttpStatus

open class CustomException(val status: HttpStatus, override val message: String) : RuntimeException()
