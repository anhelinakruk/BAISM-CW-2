package com.anhelina.baism_cw_2

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PasswordValidatorTest {
    @Test fun silneHasloPrzechodzi() = assertFalse(PasswordValidator.isStrong("Haslo1234"))
    @Test fun zaKrotkieOdrzucone() = assertFalse(PasswordValidator.isStrong("Ab1"))
    @Test fun bezCyfryOdrzucone() = assertFalse(PasswordValidator.isStrong("HasloBezCyfr"))
    @Test fun bezWielkiejLiteryOdrzucone() = assertFalse(PasswordValidator.isStrong("haslo1234"))
}
