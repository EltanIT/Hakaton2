package capybara.racesdispute.hakaton.server.data_classes.queries

import okhttp3.Response

data class SetDeadlineRequestBody(
    val waiting : String,
    val receiving : String,
    val expertise : String,
    val finishing : String
)