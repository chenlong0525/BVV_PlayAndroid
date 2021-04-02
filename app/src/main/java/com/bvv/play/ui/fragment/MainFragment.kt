package com.bvv.play.ui.fragment

import android.os.Bundle
import android.view.View
import com.bvv.play.R
import com.bvv.play.databinding.FragmentMainBinding
import com.bvv.play.ext.init
import com.bvv.play.ext.initMain
import com.kk.android.comvvmhelper.ui.BaseFragment

class MainFragment():BaseFragment<FragmentMainBinding>() {
    override fun initFragment(view: View, savedInstanceState: Bundle?) {
        //初始化viewpager2
        mBinding?.run {
            mainViewpager.initMain(this@MainFragment)
            mainBottom.init{
                when (it) {
                    R.id.menu_home -> mainViewpager.setCurrentItem(0, false)
                    R.id.menu_project -> mainViewpager.setCurrentItem(1, false)
                    R.id.menu_offical -> mainViewpager.setCurrentItem(2, false)
                    R.id.menu_mine -> mainViewpager.setCurrentItem(3, false)
                }
            }
        }
    }

    override fun layoutId()= R.layout.fragment_main
}