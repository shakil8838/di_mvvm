package xyz.xandsoft.dimvvm.repositories

import xyz.xandsoft.dimvvm.network.NetworkInterface

class AuthRepository(
    private val networkInterface: NetworkInterface
) : BaseRepository() {

    suspend fun apiCallLogin(
        email: String,
        password: String
    ) = safeAPICall(
        networkInterface.letLogin(email, password)
    )
}