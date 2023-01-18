package com.game.space.shooter2a.waxzzxs

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.game.space.shooter2a.ngfdfde.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val jvocijcv = module {

    single  <Zoaijxz> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Zoaijxz::class.java)
    }

    single <Sapxoxzjd> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Sapxoxzjd::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://velourcosmos.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Xpdoxijz(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Doosixokz(get(named("HostInter")))
    }
    single{
        mkcoxijcxhu()
    }
    single (named("SharedPreferences")) {
        osisjdwu(androidApplication())
    }
}

fun osisjdwu(viojcbv: Application): SharedPreferences {
    return viojcbv.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun mkcoxijcxhu(): Gson {
    return GsonBuilder().create()
}

val diufhusduhsdf = module {
    viewModel (named("MainModel")){
        Xopslllzxoxzisaw((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Zkxixzuzxgysa(get())
    }
}
