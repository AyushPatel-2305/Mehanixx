package com.example.mehanixx.ui.auth.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mehanixx.R
import com.example.mehanixx.databinding.FragmentSelectUserTypeBinding
import com.example.mehanixx.ui.BaseFragment

class SelectUserType : BaseFragment() {

    private lateinit var mBinding: FragmentSelectUserTypeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentSelectUserTypeBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}