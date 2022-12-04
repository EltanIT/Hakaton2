package capybara.racesdispute.hakaton.server

import android.provider.ContactsContract.CommonDataKinds.Email
import kotlinx.coroutines.delay

class AccountsRepository: BaseRetrofitSource() {
    suspend fun login(
        username: String ,
        password: String) {
        delay(1000)
        val baseRetrofitSource  = BaseRetrofitSource()
        baseRetrofitSource.Login(username,password)

    }

    suspend fun registrate(
        username: String ,
        password: String) {
        val baseRetrofitSource  = BaseRetrofitSource()
        baseRetrofitSource.Registrate(username,password)
    }
    suspend fun getUser(
        username: String) {
        val baseRetrofitSource  = BaseRetrofitSource()
        baseRetrofitSource.GetUser(username)
    }
    suspend fun request(
        full_name: String,
        post: String,
        job_place: String,
        topic_work: String,
        title_work: String,
        anotation: String,
        file: String
    ){
        val baseRetrofitSource  = BaseRetrofitSource()
        baseRetrofitSource.CreateQuery(full_name, post, job_place, topic_work, title_work, anotation, file)
    }
}