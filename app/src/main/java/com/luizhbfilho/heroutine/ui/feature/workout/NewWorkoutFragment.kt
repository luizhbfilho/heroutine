package com.luizhbfilho.heroutine.ui.feature.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.luizhbfilho.heroutine.databinding.FragmentNewWorkoutBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewWorkoutDialogFragment: Fragment() {

    private var _binding: FragmentNewWorkoutBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: NewWorkoutViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[NewWorkoutViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewWorkoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}