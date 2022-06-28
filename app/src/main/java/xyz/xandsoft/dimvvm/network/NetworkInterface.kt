package xyz.xandsoft.dimvvm.network

import androidx.lifecycle.MutableLiveData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import xyz.xandsoft.dimvvm.model.datamodels.LoginDataModel

interface NetworkInterface {

    @FormUrlEncoded
    @POST("")
    suspend fun letLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): MutableLiveData<String>

    @FormUrlEncoded
    @POST("")
    suspend fun getRegister()

    companion object {
        operator fun invoke(): NetworkInterface {
            return Retrofit.Builder()
                .baseUrl("https://")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(NetworkInterface::class.java)
        }
    }
}