package com.kotlin.study.domain.user.exception

import com.kotlin.study.global.exception.CustomException
import org.springframework.http.HttpStatus

object PasswordNotMatchException : CustomException(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다.")