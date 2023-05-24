package com.kotlin.study.domain.user.domain

import jakarta.persistence.*


@Entity
@Table(name = "user")
class User(
        var id: String,
        var password: String
) {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var userId: Long? = null
}