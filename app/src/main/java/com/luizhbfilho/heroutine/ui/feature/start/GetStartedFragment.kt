package com.luizhbfilho.heroutine.ui.feature.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.luizhbfilho.heroutine.R
import com.luizhbfilho.heroutine.databinding.FragmentGetStartedBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GetStartedFragment : Fragment() {

    private var _binding: FragmentGetStartedBinding? = null

    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGetStartedBinding.inflate(inflater, container, false)
        binding.signUpButton.setOnClickListener {
            findNavController().navigate(R.id.action_getStartedFragment_to_sign_up_fragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}