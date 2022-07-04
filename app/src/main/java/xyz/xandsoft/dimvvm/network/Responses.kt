package xyz.xandsoft.dimvvm.network

import okhttp3.ResponseBody

sealed class Responses<out T> {

    data class APISuccess<out T>(val value: T) : Responses<T>()
    data class APIFailed(
        val isNetworkError: Boolean?,
        val errorCode: Int?,
        val responseBody: ResponseBody?
    ) : Responses<Nothing>()
}