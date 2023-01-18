package com.game.space.shooter2a

import android.app.Application
import android.content.Context
import com.game.space.shooter2a.waxzzxs.jvocijcv
import com.game.space.shooter2a.waxzzxs.diufhusduhsdf
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Sooocixcjxc: Application() {

    companion object {
        var ovkvcok: String? = "main_id"
        val noinbjbnjibnjin: String = "myID"
        var oakaskoa: String? = "instID"
        const val nbibnj = "dac38352-72b1-48ea-b664-7b243fe1b896"








    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(nbibnj)




        val dokdsijds = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val obkbvjini = getSharedPreferences("PREFS_NAME", 0)

        val ijsdijsd = MyTracker.getTrackerParams()
        val ionoknbbnko = MyTracker.getTrackerConfig()
        val sijdisdjsdji = MyTracker.getInstanceId(this)
        ionoknbbnko.isTrackingLaunchEnabled = true
        val eokkof = UUID.randomUUID().toString()

        if (obkbvjini.getBoolean("my_first_time", true)) {
            ijsdijsd.setCustomUserId(eokkof)
            dokdsijds.edit().putString(noinbjbnjibnjin, eokkof).apply()
            dokdsijds.edit().putString(oakaskoa, sijdisdjsdji).apply()
            obkbvjini.edit().putBoolean("my_first_time", false).apply()
        } else {
            val nijbbnhun = dokdsijds.getString(noinbjbnjibnjin, eokkof)
            ijsdijsd.setCustomUserId(nijbbnhun)
        }
        MyTracker.initTracker("42138197446406905545", this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Sooocixcjxc)
            modules(
                listOf(
                    diufhusduhsdf, jvocijcv
                )
            )
        }
    }
}