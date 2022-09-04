package xyz.xandsoft.dimvvm.model.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import xyz.xandsoft.dimvvm.repositories.AuthRepository
import xyz.xandsoft.dimvvm.repositories.BaseRepository
import java.lang.IllegalArgumentException

class BaseViewModelFactory(
    private val repository: BaseRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(repository as AuthRepository)
            else -> throw IllegalArgumentException("Throwing exception")
        } as T
    }
}