package com.kotlin.study.global.response

import org.springframework.http.HttpStatus

class Response(val status: Int, val message: String?) {
    constructor(httpStatus: HttpStatus, message: String?) : this(httpStatus.value(), message)
}