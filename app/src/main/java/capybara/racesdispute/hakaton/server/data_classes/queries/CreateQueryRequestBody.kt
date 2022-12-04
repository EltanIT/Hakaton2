package capybara.racesdispute.hakaton.server.data_classes.queries

data class CreateQueryRequestBody(
    val full_name : String,
    val post: String,
    val job_place: String,
    val topic_work: String,
    val title_work: String,
    val annotation: String,
    val file: String
    )
