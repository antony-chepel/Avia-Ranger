package com.game.space.shooter2a.waxzzxs
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.game.space.shooter2a.R
import com.game.space.shooter2a.ngfdfde.Xopslllzxoxzisaw


import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Jixozxijcs : Fragment() {
    val siddjsi by activityViewModel<Xopslllzxoxzisaw>(named("MainModel"))
    private lateinit var kxzkocoz: Context
    val obvijv: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var eokd: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mbobvi, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fokvcko = obvijv.getString("apps", null)
        val qppsoskaksodo = obvijv.getString("appCamp", null)

        if (fokvcko=="1" &&qppsoskaksodo == null) {
            siddjsi.nookijbjiv(kxzkocoz)
            siddjsi.apalsplsa.observe(viewLifecycleOwner) {

                if (it != null) {
                    eokd = it.toString()
                    obvijv.edit().putString("appCamp", eokd).apply()
                    findNavController().navigate(R.id.action_beeeeforFiiilFragment_to_fiiilttterFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_beeeeforFiiilFragment_to_fiiilttterFragment)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        kxzkocoz = context
    }

}