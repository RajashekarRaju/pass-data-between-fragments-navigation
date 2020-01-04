package com.developersbreach.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var mNavigationController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mNavigationController = Navigation.findNavController(this, R.id.myNavHostFragment)
        val configuration: AppBarConfiguration =
            AppBarConfiguration.Builder(mNavigationController.graph).build()
        NavigationUI.setupActionBarWithNavController(this, mNavigationController, configuration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return mNavigationController.navigateUp()
    }
}
