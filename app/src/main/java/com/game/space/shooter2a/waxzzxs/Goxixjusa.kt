package com.game.space.shooter2a.waxzzxs

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.game.space.shooter2a.Sooocixcjxc.Companion.oakaskoa
import com.game.space.shooter2a.Sooocixcjxc.Companion.ovkvcok
import com.game.space.shooter2a.databinding.KivocicBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class Goxixjusa : AppCompatActivity() {
    private val kixjcjix = 1
    private var sisdj: ValueCallback<Array<Uri>>? = null
    lateinit var lcoxplxc: WebView
    private var kocjixi = false

    private var osoaskkosdk: String? = null

    private lateinit var ccoxkxc: KivocicBinding
    var doicjxhuxch = ""




    private val ovjicuhcvhu by viewModel<Zkxixzuzxgysa>(
        named("BeamModel")
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ccoxkxc = KivocicBinding.inflate(layoutInflater)
        setContentView(ccoxkxc.root)
        lcoxplxc = ccoxkxc.uxzis
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(lcoxplxc, true)
        ovjicuhcvhu.appapaoksoka(lcoxplxc)


        lcoxplxc.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (ovjicuhcvhu.sidjjas(url)) {

                        val obvjivbji = Intent(Intent.ACTION_VIEW)
                        obvjivbji.data = Uri.parse(url)
                        startActivity(obvjivbji)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                aosoxixjzczx(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@Goxixjusa, description, Toast.LENGTH_SHORT).show()
            }
        }

        lcoxplxc.webChromeClient = Cisoxzjixjizc()
        lcoxplxc.loadUrl(vicocvkc())
    }


    override fun onBackPressed() {

        if (lcoxplxc.canGoBack()) {
            if (kocjixi) {
                lcoxplxc.stopLoading()
                lcoxplxc.loadUrl(doicjxhuxch)
            }
            this.kocjixi = true
            lcoxplxc.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                kocjixi = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun vicocvkc(): String {

        val eijdjisa = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val jsokddsaji = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )
        val mkcxoxcjixci = jsokddsaji.getString(ovkvcok, null)
        val qoskd = jsokddsaji.getString("WebInt", null)
        val ytssiasdj = jsokddsaji.getString(oakaskoa, null)
        val iidofokds = jsokddsaji.getString("link", null)






        when (qoskd) {
            "campaign" -> {
                ovjicuhcvhu.oicixjjixc(mkcxoxcjixci.toString())
            }
            "deepLink" -> {
                ovjicuhcvhu.oicixjjixc(mkcxoxcjixci.toString())
            }
            "deepLinkNOApps" -> {
                ovjicuhcvhu.oicixjjixc(ytssiasdj.toString())
            }
            "geo" -> {
                ovjicuhcvhu.oicixjjixc(ytssiasdj.toString())
            }

        }
        return eijdjisa.getString("SAVED_URL", iidofokds).toString()
    }

    inner class Cisoxzjixjizc : WebChromeClient() {

        override fun onShowFileChooser(
            fijd: WebView?,
            mcoxkcxi: ValueCallback<Array<Uri>>?,
            wijsjid: FileChooserParams?
        ): Boolean {
            sisdj?.onReceiveValue(null)
            sisdj = mcoxkcxi
            var jxzbcbuzxc: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (jxzbcbuzxc!!.resolveActivity(packageManager) != null) {
                var oeoewjijiwji: File? = null
                try {
                    oeoewjijiwji = ftushdsji()
                    jxzbcbuzxc.putExtra("PhotoPath", osoaskkosdk)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (oeoewjijiwji != null) {
                    osoaskkosdk = "file:" + oeoewjijiwji.absolutePath
                    jxzbcbuzxc.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(oeoewjijiwji)
                    )
                } else {
                    jxzbcbuzxc = null
                }
            }
            val jxcjixuhzuzxcgys = Intent(Intent.ACTION_GET_CONTENT)
            jxcjixuhzuzxcgys.addCategory(Intent.CATEGORY_OPENABLE)
            jxcjixuhzuzxcgys.type = "image/*"
            val xuhchuchzxu: Array<Intent?> =
                jxzbcbuzxc?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val kxcjisj = Intent(Intent.ACTION_CHOOSER)
            kxcjisj.putExtra(Intent.EXTRA_INTENT, jxcjixuhzuzxcgys)
            kxcjisj.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            kxcjisj.putExtra(Intent.EXTRA_INITIAL_INTENTS, xuhchuchzxu)
            startActivityForResult(kxcjisj, kixjcjix)
            return true
        }

        fun ftushdsji(): File? {
            val xjcnzicj = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val sjdisasd = "JPEG_" + xjcnzicj + "_"
            val xkxclzxokcoxzcocjis = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                sjdisasd,
                ".jpg",
                xkxclzxokcoxzcocjis
            )
        }
    }

    fun aosoxixjzczx(qokosd: String?) {
        if (!qokosd!!.contains("t.me")) {

            if (doicjxhuxch == "") {
                doicjxhuxch = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    qokosd
                ).toString()

                val kcoxjiv =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val lslsooskdjiasd = kcoxjiv.edit()
                lslsooskdjiasd.putString("SAVED_URL", qokosd)
                lslsooskdjiasd.apply()
            }
        }
    }
    override fun onActivityResult(ogk: Int, zixjjz: Int, oskdkosjia: Intent?) {

        if (ogk != kixjcjix || sisdj == null) {
            super.onActivityResult(ogk, zixjjz, oskdkosjia)
            return
        }
        var ockdodfjfjid: Array<Uri>? = null

        if (zixjjz == RESULT_OK) {
            if (oskdkosjia == null) {
                if (osoaskkosdk != null) {
                    ockdodfjfjid = arrayOf(Uri.parse(osoaskkosdk))
                }
            } else {
                val tixjzhuxzhzx = oskdkosjia.dataString
                if (tixjzhuxzhzx != null) {
                    ockdodfjfjid = arrayOf(Uri.parse(tixjzhuxzhzx))
                }
            }
        }
        sisdj!!.onReceiveValue(ockdodfjfjid)
        sisdj = null
        return
    }

}

