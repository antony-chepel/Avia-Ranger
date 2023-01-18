package com.game.space.shooter2a.ngfdfde

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.game.space.shooter2a.R
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Saoxozij : Fragment() {
    val aplxkoz: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var ifjdko: String
    val zokxokz by activityViewModel<Xopslllzxoxzisaw>(named("MainModel"))
    lateinit var kcxock: String
    lateinit var kmmkcx: String
    private lateinit var dokxc: Context








    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        zokxokz.ivjcji.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                aplxkoz.edit().putString("mainId", main).apply()
            }
        }

        zokxokz.qosk.observe(viewLifecycleOwner) {
            if (it != null) {

                kmmkcx = it.inijb
                ifjdko = it.isaokkosa
                kcxock = it.apzlLP

                aplxkoz.edit().putString("countryDev", kmmkcx).apply()
                aplxkoz.edit().putString("apps", ifjdko).apply()
                aplxkoz.edit().putString("wv", kcxock).apply()

                findNavController().navigate(R.id.voibuiids)
            }
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        dokxc = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.odidsu, container, false)
    }

}