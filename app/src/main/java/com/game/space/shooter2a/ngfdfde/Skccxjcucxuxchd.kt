package com.game.space.shooter2a.ngfdfde

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.game.space.shooter2a.Xoxpxisudys
import com.game.space.shooter2a.databinding.ActivitySkccxjcucxuxchdBinding

class Skccxjcucxuxchd : AppCompatActivity() {
    private lateinit var kcxjicxi : ActivitySkccxjcucxuxchdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kcxjicxi = ActivitySkccxjcucxuxchdBinding.inflate(layoutInflater)
        setContentView(kcxjicxi.root)
        osisjajisd()
    }

    private fun osisjajisd() = with(kcxjicxi){
        val isjds = intent.getIntExtra("score",0)
        ciojvi.text = "Found $isjds avias"
        oksdkosda.setOnClickListener {
            startActivity(Intent(this@Skccxjcucxuxchd,Xoxpxisudys::class.java))
        }
    }
}