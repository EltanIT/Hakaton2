package capybara.racesdispute.hakaton.server.data_classes.queries

data class SetDeadlineRequestBody(
    val waiting : String,
    val receiving : String,
    val expertise : String,
    val finishing : String
)