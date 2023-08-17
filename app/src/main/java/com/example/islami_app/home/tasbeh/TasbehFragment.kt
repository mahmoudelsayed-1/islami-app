package com.example.islami_app.home.tasbeh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islami_app.databinding.FragmentTasbehBinding

class TasbehFragment : Fragment() {

    lateinit var viewBindig: FragmentTasbehBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindig = FragmentTasbehBinding.inflate(inflater, container, false)
        return viewBindig.root
    }


}