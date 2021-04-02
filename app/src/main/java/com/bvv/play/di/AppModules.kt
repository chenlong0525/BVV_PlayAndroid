package com.bvv.play.di

import com.bvv.play.model.HomeArticle
import com.bvv.play.ui.adapter.HomeAdapter
import com.bvv.play.ui.fragment.home.HomeFragment
import org.koin.dsl.module

val adapterModule = module {
    scope<HomeFragment> {
        scoped { (items: MutableList<HomeArticle>) -> HomeAdapter(items) }
    }
}