package capybara.racesdispute.hakaton.server.data_classes.queries

data class SetScoreByIdRequestBody(
    val id_query : Int,
    val sum_score : Int
)
