package com.kotlin.study.domain.user.domain.repository

import com.kotlin.study.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findUserById(id:String) : User
}