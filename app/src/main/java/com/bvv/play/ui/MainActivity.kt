package com.bvv.play.ui

import android.os.Bundle
import com.bvv.play.R
import com.bvv.play.databinding.ActivityMainBinding
import com.kk.android.comvvmhelper.ui.BaseActivity
import org.koin.androidx.scope.activityScope
import org.koin.core.scope.KoinScopeComponent
import org.koin.core.scope.Scope

class MainActivity : BaseActivity<ActivityMainBinding>(), KoinScopeComponent {


    override fun initActivity(savedInstanceState: Bundle?) {

    }

    override fun layoutId() = R.layout.activity_main

    override val scope: Scope by lazy { activityScope() }

    
}