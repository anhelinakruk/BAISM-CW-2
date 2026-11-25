package com.anhelina.baism_cw_2

object PasswordValidator {
    fun isStrong(password: String): Boolean {
        if (password.length < 8) return false
        val hasDigit = password.any { it.isDigit() }
        val hasUpper = password.any { it.isUpperCase() }
        val hasLower = password.any { it.isLowerCase() }
        return hasDigit && hasUpper && hasLower
    }
}