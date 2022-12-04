package capybara.racesdispute.hakaton.server

import capybara.racesdispute.hakaton.server.data_classes.queries.*
import capybara.racesdispute.hakaton.server.data_classes.users.*
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Header
import retrofit2.http.Query

interface Api {

    @POST("/registration")
    suspend fun signUp(@Body body: SignUpRequestBody): SignUpResponseBody

    @POST("/login")
    suspend fun signIn(@Body body: SignInRequestBody): SignInResponseBody

    @GET("/get_user/{email}")
    suspend fun get_user(@Path("email") email: String): GetUserResponseBody





    @POST("/create_query")
    suspend fun create_query(@Body body: CreateQueryRequestBody): CreateQueryResponseBody

    @GET("/get_queries")
    suspend fun get_queries(): GetQueriesResponseBody

    @GET("/get_query_by_id/{id}")
    suspend fun get_query_by_id(@Path("id") id : Int):GetQueryByIdResponseBody

    @GET("/get_query_by_email/{email}")
    suspend fun get_query_by_id(@Path("email") email : String): GetQueryByEmailResponseBody



    @POST("/set_score_by_id/")
    suspend fun  set_score_by_id(@Body body: SetScoreByIdRequestBody):SetScoreByIdResponseBody




}

