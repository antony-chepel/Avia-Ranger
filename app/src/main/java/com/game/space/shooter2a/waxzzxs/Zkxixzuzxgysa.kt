package com.game.space.shooter2a.waxzzxs

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Zkxixzuzxgysa(dosdkodsf: Application): ViewModel() {

    val cokxxcj = dosdkodsf.packageManager


    fun sidjjas(xicj: String): Boolean {
        try {
            cokxxcj.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun appapaoksoka(hoighjgh: WebView): WebSettings{
        val odkkockoxv = hoighjgh.settings
        odkkockoxv.domStorageEnabled = true
        odkkockoxv.allowFileAccess = true
        odkkockoxv.pluginState = WebSettings.PluginState.ON
        odkkockoxv.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        odkkockoxv.displayZoomControls = false
        odkkockoxv.builtInZoomControls = true
        odkkockoxv.javaScriptEnabled = true
        odkkockoxv.allowContentAccess = true
        odkkockoxv.useWideViewPort = true
        odkkockoxv.allowContentAccess = true
        odkkockoxv.mediaPlaybackRequiresUserGesture = false
        odkkockoxv.loadWithOverviewMode = true
        odkkockoxv.allowFileAccess = true
        odkkockoxv.setSupportMultipleWindows(false)
        odkkockoxv.userAgentString = odkkockoxv.userAgentString.replace("; wv", "")
        odkkockoxv.javaScriptCanOpenWindowsAutomatically = true
        odkkockoxv.setSupportZoom(true)

        odkkockoxv.setAppCacheEnabled(true)



        return odkkockoxv
    }

    fun oicixjjixc(sodkasd: String) {
        OneSignal.setExternalUserId(
            sodkasd,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(vijvjibji: JSONObject) {
                    try {
                        if (vijvjibji.has("push") && vijvjibji.getJSONObject("push").has("success")) {
                            val doskdsijds = vijvjibji.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $doskdsijds"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (vijvjibji.has("email") && vijvjibji.getJSONObject("email").has("success")) {
                            val qokasjijia =
                                vijvjibji.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $qokasjijia"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (vijvjibji.has("sms") && vijvjibji.getJSONObject("sms").has("success")) {
                            val nobijbnuhb = vijvjibji.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $nobijbnuhb"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }







}