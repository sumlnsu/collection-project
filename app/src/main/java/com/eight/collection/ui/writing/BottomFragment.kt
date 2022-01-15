package com.eight.collection.ui.writing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eight.collection.databinding.FragmentBottomBinding

class BottomFragment : Fragment(){
    lateinit var binding : FragmentBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomBinding.inflate(inflater,container,false)

        return binding.root
    }

}