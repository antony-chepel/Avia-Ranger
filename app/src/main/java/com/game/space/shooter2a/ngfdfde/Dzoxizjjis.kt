package com.game.space.shooter2a.ngfdfde

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.game.space.shooter2a.R
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Dzoxizjjis : Fragment() {
    val vockkcvjivc by activityViewModel<Xopslllzxoxzisaw>(named("MainModel"))

    private lateinit var dooxzo: Context

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vockkcvjivc.inobnkbij(dooxzo)

        findNavController().navigate(R.id.kdsidjisd)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cpsoaaos, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        dooxzo=context
    }
}