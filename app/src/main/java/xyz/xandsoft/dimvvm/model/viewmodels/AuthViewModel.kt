package xyz.xandsoft.dimvvm.model.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import xyz.xandsoft.dimvvm.repositories.AuthRepository

class AuthViewModel(
    private val repository: AuthRepository
) : ViewModel() {

}