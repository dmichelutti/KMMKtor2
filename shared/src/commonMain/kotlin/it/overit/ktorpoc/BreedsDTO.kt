package it.overit.ktorpoc

import kotlinx.serialization.Serializable

@Serializable
data class BreedsDTO(
    val message: Message,
    val status: String
)
