package capybara.racesdispute.hakaton

import retrofit2.http.Body
import retrofit2.http.POST

interface Api {
    @POST("/login")
    suspend fun signUp(@Body body: SignUpRequestBody): SignUpResponseBody

    @POST("/regisrtation")
    suspend fun signIn(@Body body: SignInRequestBody): SignInResponseBody


}