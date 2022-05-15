package com.example.mehanixx.ui.auth.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mehanixx.R
import com.example.mehanixx.databinding.FragmentLoginBinding
import com.example.mehanixx.ui.BaseFragment

class LoginFragment : BaseFragment() {

    private lateinit var mBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!this::mBinding.isInitialized) {
            mBinding = FragmentLoginBinding.inflate(inflater, container, false)
            mBinding.lifecycleOwner = this
        }
        return mBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.btnSubmit.setOnClickListener {
            mBinding.btnSubmit.text = "Verify Otp"
            mBinding.etOtp.visibility = View.VISIBLE
            setNextClick()
        }

    }

    private fun setNextClick() {
        mBinding.btnSubmit.setOnClickListener { findNavController().navigate(R.id.to_select_user) }
    }
}
