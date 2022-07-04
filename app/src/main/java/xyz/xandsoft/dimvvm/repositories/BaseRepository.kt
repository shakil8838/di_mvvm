package xyz.xandsoft.dimvvm.repositories

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import xyz.xandsoft.dimvvm.network.Responses

abstract class BaseRepository {

    suspend fun <T> safeAPICall(
        response: T
    ): Responses<T> {
        return withContext(Dispatchers.IO) {
            try {
                Responses.APISuccess(response)
            } catch (throwable: Throwable) {
                when (throwable) {
                    is HttpException -> {
                        Responses.APIFailed(
                            false,
                            throwable.code(),
                            throwable.response()?.errorBody()
                        )
                    }
                    else -> {
                        Responses.APIFailed(
                            true,
                            null,
                            null
                        )
                    }
                }
            }
        }
    }
}