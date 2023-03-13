package com.luizhbfilho.heroutine.features.authentication

import androidx.fragment.app.Fragment
import com.luizhbfilho.heroutine.features.authentication.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onDestroy() {
        super.onDestroy()
    }
}