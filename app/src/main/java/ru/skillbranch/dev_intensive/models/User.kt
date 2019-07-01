package ru.skillbranch.dev_intensive.models

import ru.skillbranch.dev_intensive.utils.Utils
import java.util.*

data class User(
    val id: String,
    val firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, "John", "Doe")

    init {

        println(
            "It's Alive!!!!\n" +
                    "${if (lastName === "Doe") "His name is $firstName $lastName" else "And his name is $firstName $lastName"}\n"
        )
    }

    companion object Factory {
        private var last_id: Int = -1
        fun makeUser(fullName: String?): User {
            last_id++

            val (firstName, lastName) = Utils.parseFullName(fullName)

            return User(id = "$last_id", firstName = firstName, lastName = lastName)
        }
    }
}