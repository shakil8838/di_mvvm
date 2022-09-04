package xyz.xandsoft.dimvvm.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import xyz.xandsoft.dimvvm.network.NetworkInterface
import xyz.xandsoft.dimvvm.repositories.BaseRepository

abstract class BaseFragment<VM : ViewModel, VB : ViewBinding, BR : BaseRepository> : Fragment() {

    protected lateinit var binding: VB
    protected val networkInterface = NetworkInterface()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return getViewBinding(inflater, container).root
    }

    abstract fun getViewModel(): Class<VM>

    abstract fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    abstract fun getRepository(): BR
}