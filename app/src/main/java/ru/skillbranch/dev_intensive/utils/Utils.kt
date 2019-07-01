package ru.skillbranch.dev_intensive.utils

object Utils {
    fun parseFullName(fullNameString: String?): Pair<String?, String?> = when (fullNameString.isNullOrBlank()) {
        true -> null to null
        else -> {
            val parts: List<String> = fullNameString.split(" ")
            if (parts.size == 1) parts[0] to null else parts[0] to parts[1]
        }
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun toInitials(firstName: String?, lastName: String?) = when (firstName.isNullOrBlank() to lastName.isNullOrBlank()) {
        true to true -> null
        false to true -> "${firstName!![0].toUpperCase()}"
        true to false -> "${lastName!![0].toUpperCase()}"
        else -> "${firstName!![0].toUpperCase()}${lastName!![0].toUpperCase()}"
    }
}