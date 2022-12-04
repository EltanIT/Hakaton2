package capybara.racesdispute.hakaton.server

import capybara.racesdispute.hakaton.server.data_classes.*
import capybara.racesdispute.hakaton.server.data_classes.queries.*
import capybara.racesdispute.hakaton.server.data_classes.ratings.GetRatingsResponseBody
import capybara.racesdispute.hakaton.server.data_classes.steps.GetDeadLinesResponseBody
import capybara.racesdispute.hakaton.server.data_classes.steps.GetStatusResponseBody
import capybara.racesdispute.hakaton.server.data_classes.steps.SetDeadLineResponseBody
import capybara.racesdispute.hakaton.server.data_classes.steps.SetDeadlineRequestBody
import capybara.racesdispute.hakaton.server.data_classes.users.*
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.HeaderMap
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Header as Header

interface Api {

    @POST("/registration")
    suspend fun signUp(@Body body: SignUpRequestBody): SignUpResponseBody

    @POST("/login")
    suspend fun signIn(@Body body: SignInRequestBody): SignInResponseBody

    @GET("/get_user/{email}")
    suspend fun get_user(@Path("email") email: String): GetUserResponseBody



    @GET("/get_status")
    suspend fun get_status(): GetStatusResponseBody

    @POST("/set_deadlines")
    suspend fun set_deadLine(@Body body: SetDeadlineRequestBody): SetDeadLineResponseBody

    @GET("/get_deadlines")
    suspend fun get_deadlines(): GetDeadLinesResponseBody



    @POST("/create_query")
    suspend fun create_query(@Body body: CreateQueryRequestBody, @HeaderMap head: CreateQueryRequestHead): CreateQueryResponseBody

    @GET("/get_queries")
    suspend fun get_queries(): GetQueriesResponseBody

    @GET("/get_query_by_id/{id}")
    suspend fun get_query_by_id(@Path("id") id : Int):GetQueryByIdResponseBody

    @GET("/get_query_by_email/{email}")
    suspend fun get_query_by_id(@Path("email") email : String): GetQueryByEmailResponseBody



    @POST("/set_score_by_id/")
    suspend fun  set_score_by_id(@Body body: SetScoreByIdRequestBody):SetScoreByIdResponseBody

    @GET("/get_ratings")
    suspend fun get_ratings():GetRatingsResponseBody



}