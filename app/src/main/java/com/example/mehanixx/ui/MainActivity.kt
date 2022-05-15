package com.example.mehanixx.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mehanixx.R
import com.example.mehanixx.databinding.ActivityMainBinding

class MainActivity : FragmentActivity(), NavController.OnDestinationChangedListener {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        mBinding.lifecycleOwner = this
        setContentView(mBinding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        navController?.addOnDestinationChangedListener(this)


    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
    }
}