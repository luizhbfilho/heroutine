package com.luizhbfilho.heroutine.ui.fragment.diet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.luizhbfilho.heroutine.databinding.FragmentDietBinding

class DietFragment: Fragment() {

    private var _binding: FragmentDietBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}