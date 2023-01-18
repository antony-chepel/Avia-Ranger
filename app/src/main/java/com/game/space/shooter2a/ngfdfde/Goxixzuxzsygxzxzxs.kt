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

class Goxixzuxzsygxzxzxs : Fragment() {
    private lateinit var pspkodaso: Context

    lateinit var oocijji: String
    val sidjjasdi by activityViewModel<Xopslllzxoxzisaw>(named("MainModel"))

    val cjnxcxij: SharedPreferences by inject(named("SharedPreferences"))





    override fun onAttach(context: Context) {
        super.onAttach(context)
        pspkodaso = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sidjjasdi.sovokbkovks.observe(viewLifecycleOwner) {
            if (it!=null) {
                oocijji = it.ibjv
                cjnxcxij.edit().putString("country", oocijji).apply()
                findNavController().navigate(R.id.xzisisudwko)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.niugfif, container, false)
    }

}