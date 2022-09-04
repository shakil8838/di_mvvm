package xyz.xandsoft.dimvvm.ui.fragments.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xyz.xandsoft.dimvvm.R
import xyz.xandsoft.dimvvm.databinding.FragmentLoginBinding
import xyz.xandsoft.dimvvm.model.viewmodels.AuthViewModel
import xyz.xandsoft.dimvvm.repositories.AuthRepository
import xyz.xandsoft.dimvvm.ui.fragments.BaseFragment


class LoginFragment : BaseFragment<AuthViewModel, FragmentLoginBinding, AuthRepository>() {

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
*/
    override fun getViewModel() = AuthViewModel::class.java

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getRepository() = AuthRepository(networkInterface = networkInterface)


}