package it.overit.ktorpoc

import platform.Foundation.NSLocale
import platform.Foundation.countryCode
import platform.Foundation.currentLocale
import platform.Foundation.languageCode

actual class Language {
    actual val language: String
        get() = NSLocale.currentLocale.languageCode

    actual val country: String?
        get() = NSLocale.currentLocale.countryCode
}