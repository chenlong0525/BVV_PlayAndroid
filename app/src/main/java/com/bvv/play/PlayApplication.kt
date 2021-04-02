package com.bvv.play

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.bvv.play.di.adapterModule
import com.bvv.play.helper.GlideEngine
import com.kk.android.comvvmhelper.startCov
import okhttp3.OkHttpClient

class PlayApplication: Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var instance: Context
    }
    override fun onCreate() {
        super.onCreate()
        instance=this
        startCov {
            // DataBinding 加载图片, 可灵活配置三方图片加载框架, 具体可查看 demo
            // GlideEngine: https://github.com/kukyxs/CoMvvmHelper/blob/master/app/src/main/java/com/kuky/comvvmhelper/helper/GlideEngine.kt
            // CoilEngine: https://github.com/kukyxs/CoMvvmHelper/blob/master/app/src/main/java/com/kuky/comvvmhelper/helper/CoilEngine.kt
            loadEngine = GlideEngine()

            koinModules = mutableListOf(adapterModule) // koin 注入 module

            baseUrl = Constant.WAN_URL // retrofit baseUrl(RetrofitApiService 支持动态 url, 详见后续)

            koinPropertiesFile = "" // koin properties 配置文件名

            client = OkHttpClient.Builder().build() // 网络 client 配置

            customRetrofitCallAdapterArray = mutableListOf() // retrofit call adapter 配置

            customRetrofitConverterFactoryArray = mutableListOf() // retrofit converter 配置(默认已有 Gson)
        }
    }
}