package com.rhosseini.navigationsample.multiNavHost.listScreen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rhosseini.navigationsample.R

/**
 * A simple [Fragment] subclass.
 */
class List3 : ListMenuFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list3, container, false)
    }

}
