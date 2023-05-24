package com.kotlin.study.domain.user.persentation

import com.kotlin.study.domain.user.persentation.dto.UserRequest
import com.kotlin.study.domain.user.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
        private val userService: UserService
) {
    @PostMapping("/signup")
    fun signup(@RequestBody userRequest: UserRequest) {
        return userService.signup(userRequest)
    }

    @PostMapping("/login")
    fun login(@RequestBody userRequest: UserRequest) {
        return userService.login(userRequest);
    }
}