package ru.skillbranch.dev_intensive.utils

object Utils {
    fun parseFullName(fullNameString: String?): Pair<String?, String?> {
        //TODO FIX ME!!!
        val parts: List<String>? = fullNameString?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}