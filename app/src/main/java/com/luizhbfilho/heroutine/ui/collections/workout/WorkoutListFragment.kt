package com.luizhbfilho.heroutine.ui.collections.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.luizhbfilho.heroutine.R
import com.luizhbfilho.heroutine.databinding.FragmentWorkoutListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WorkoutListFragment : Fragment() {

    private var _binding: FragmentWorkoutListBinding? = null

    private val binding get() = _binding!!

    private lateinit var adapter: WorkoutListAdapter

    private lateinit var viewModel: WorkoutListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[WorkoutListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWorkoutListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addWorkoutButton.setOnClickListener{
            findNavController().navigate(R.id.action_workout_list_to_new_workout)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}