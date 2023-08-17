package com.example.islami_app.home.radio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami_app.databinding.FragmentRadioBinding

class RadioFragment : Fragment() {

    lateinit var viewBindig: FragmentRadioBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindig = FragmentRadioBinding.inflate(inflater, container, false)
        return viewBindig.root
    }


}