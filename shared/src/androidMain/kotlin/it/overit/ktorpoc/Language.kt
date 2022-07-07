package it.overit.ktorpoc

import java.util.*

actual class Language {
    actual val language: String
        get() = Locale.getDefault().language

    actual val country: String?
        get() = Locale.getDefault().country
}