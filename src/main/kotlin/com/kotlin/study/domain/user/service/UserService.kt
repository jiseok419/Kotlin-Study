package com.kotlin.study.domain.user.service

import com.kotlin.study.domain.user.domain.User
import com.kotlin.study.domain.user.domain.repository.UserRepository
import com.kotlin.study.domain.user.exception.PasswordNotMatchException
import com.kotlin.study.domain.user.persentation.dto.UserRequest
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Slf4j
@Service
class UserService(
        private val userRepository: UserRepository
) {

    fun login(request: UserRequest) {
        val user : User = userRepository.findUserById(request.id)
        if(user.password != request.password) {
            throw PasswordNotMatchException
        }
        print("성공")
    }

    fun signup(request: UserRequest) {
        val user = User(request.id, request.password)
        userRepository.save(user)
    }
}