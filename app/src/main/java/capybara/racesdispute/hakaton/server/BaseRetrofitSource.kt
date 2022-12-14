package capybara.racesdispute.hakaton.server

import android.util.Log
import capybara.racesdispute.hakaton.server.data_classes.postFile.PostFileRequestBody
import capybara.racesdispute.hakaton.server.data_classes.queries.CreateQueryRequestBody
import capybara.racesdispute.hakaton.server.data_classes.queries.CreateQueryRequestHead
import capybara.racesdispute.hakaton.server.data_classes.users.SignInRequestBody
import capybara.racesdispute.hakaton.server.data_classes.users.SignUpRequestBody
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.FileInputStream

open class BaseRetrofitSource {
    suspend fun Login (username: String , password: String): String{
        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshi = Moshi.Builder().build()

        val  moshiConverterFactory = MoshiConverterFactory.create(moshi)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://176.28.64.201:3437/")
            .client(client)
            .addConverterFactory(moshiConverterFactory)
            .build()

        val api = retrofit.create(Api::class.java)

        val requestBody = SignInRequestBody(
            username = username,
            password = password
        )

        val response = api.signIn(requestBody)
        return  response.access_token

    }
    suspend fun Registrate ( username: String , password: String): String{
        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshi = Moshi.Builder().build()

        val  moshiConverterFactory = MoshiConverterFactory.create(moshi)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://176.28.64.201:3437/")
            .client(client)
            .addConverterFactory(moshiConverterFactory)
            .build()

        val api = retrofit.create(Api::class.java)

        val requestBody = SignUpRequestBody(
            username = username,
            password = password
        )

        val response = api.signUp(requestBody)
        return  response.access_token

    }
    suspend fun CreateQuery(full_name: String, post: String, job_place: String, topic_work: String, title_work: String, annotation: String, file: String,Authorization: String) : String{
        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshi = Moshi.Builder().build()

        val  moshiConverterFactory = MoshiConverterFactory.create(moshi)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://176.28.64.201:3437/")
            .client(client)
            .addConverterFactory(moshiConverterFactory)
            .build()

        val api = retrofit.create(Api::class.java)

        val requestBody = CreateQueryRequestBody(
            full_name = full_name,
            post = post,
            job_place = job_place,
            topic_work = topic_work,
            title_work = title_work,
            annotation = annotation,
            file = file
        )

        val response = api.create_query(requestBody,Authorization)
        return response.result

    }
    suspend fun GetUser (username : String){
        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshi = Moshi.Builder().build()

        val  moshiConverterFactory = MoshiConverterFactory.create(moshi)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://176.28.64.201:3437/")
            .client(client)
            .addConverterFactory(moshiConverterFactory)
            .build()

        val api = retrofit.create(Api::class.java)
        val response = api.get_user(username)
    }
    suspend fun UploadFile(file: FileInputStream){
        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshi = Moshi.Builder().build()

        val  moshiConverterFactory = MoshiConverterFactory.create(moshi)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://176.28.64.201:3437/")
            .client(client)
            .addConverterFactory(moshiConverterFactory)
            .build()

        val api = retrofit.create(Api::class.java)

        val requestBody = PostFileRequestBody(
            file = file)
        val response = api.upload_file(requestBody)
    }
}