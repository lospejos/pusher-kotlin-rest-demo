package api

import java.time.Instant
import com.fasterxml.jackson.annotation.JsonCreator

data class Comment(
        val author: String,
        val content: String,
        val created: Instant
)

data class NewComment @JsonCreator constructor(
        val author: String,
        val content: String
)