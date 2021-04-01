package com.bvv.play.ui

import android.os.Bundle
import com.bvv.play.R
import com.bvv.play.databinding.ActivityMainBinding
import com.kk.android.comvvmhelper.ui.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {


    override fun initActivity(savedInstanceState: Bundle?) {

    }

    override fun layoutId()= R.layout.activity_main
}