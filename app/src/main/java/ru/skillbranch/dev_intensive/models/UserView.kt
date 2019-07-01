package ru.skillbranch.dev_intensive.models

class UserView(
    val id: String,
    val fullName: String,
    val nickname: String,
    val avatar: String? = null,
    var status: String = "offline",
    val initials: String?
) {
    fun printMe() {
        println(
            """
            id :$id
            fullName :$fullName
            nickname :$nickname
            avatar :$avatar
            status :$status
            initials :$initials
        """.trimIndent()
        )
    }
}