package com.bvv.play.ui.adapter

import com.bvv.play.R
import com.bvv.play.model.HomeArticle
import com.kk.android.comvvmhelper.ui.BaseRecyclerViewAdapter
import com.kk.android.comvvmhelper.ui.BaseRecyclerViewHolder

class HomeAdapter(items: MutableList<HomeArticle>):BaseRecyclerViewAdapter<HomeArticle>() {
    override fun layoutId(viewType: Int)= R.layout.adapter_article

    override fun setVariable(
        data: HomeArticle,
        holder: BaseRecyclerViewHolder,
        dataPosition: Int,
        layoutPosition: Int
    ) {

    }
}