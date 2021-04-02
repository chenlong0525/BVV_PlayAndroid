package com.bvv.play.ui.fragment.home

import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.bvv.play.R
import com.bvv.play.databinding.FragmentHomeBinding
import com.bvv.play.model.BannerBean
import com.bvv.play.ui.adapter.HomeAdapter
import com.kk.android.comvvmhelper.ui.BaseFragment
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import org.koin.android.ext.android.inject


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    val homeAdapter:HomeAdapter by inject<HomeAdapter>()

    override fun initFragment(view: View, savedInstanceState: Bundle?) {

        mBinding?.run {

//            banner.setAdapter(object : BannerImageAdapter<BannerBean>() {
//                override fun onBindView(
//                    holder: BannerImageHolder,
//                    data: List<BannerBean>,
//                    position: Int,
//                    size: Int
//                ) {
//                    //图片加载自己实现
//                    Glide.with(holder.itemView)
//                        .load(data.imageUrl)
//                        .apply(RequestOptions.bitmapTransform(RoundedCorners(30)))
//                        .into(holder.imageView)
//                }
//            })
//                .addBannerLifecycleObserver(this@HomeFragment) //添加生命周期观察者
//                .setIndicator(CircleIndicator(context))
        }
    }

    override fun layoutId() = R.layout.fragment_home
}