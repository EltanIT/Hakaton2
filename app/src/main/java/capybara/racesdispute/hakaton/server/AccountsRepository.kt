package capybara.racesdispute.hakaton.server

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
}