package com.luizhbfilho.heroutine.ui.collections.workout

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.luizhbfilho.heroutine.databinding.FragmentNewWorkoutBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewWorkoutFragment: Fragment() {

    private var _binding: FragmentNewWorkoutBinding? = null

    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}