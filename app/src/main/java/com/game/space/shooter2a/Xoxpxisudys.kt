package com.game.space.shooter2a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.game.space.shooter2a.databinding.ActivityXoxpxisudysBinding
import com.game.space.shooter2a.ngfdfde.Skccxjcucxuxchd
import kotlin.random.Random

class Xoxpxisudys : AppCompatActivity() {
    private var sioaskddsok = 0

    val lishjzxhuc = listOf(
        R.drawable.av_ranger_plane,
        R.drawable.av_ranger_par,
    )
    private var kookkxco = 0
    private lateinit var zpxoxij : ActivityXoxpxisudysBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zpxoxij = ActivityXoxpxisudysBinding.inflate(layoutInflater)
        setContentView(zpxoxij.root)
        didfuh()

    }

    private fun didfuh() = with(zpxoxij){
        dopdsokf.setOnClickListener {
            dopdsokf.setImageResource(lishjzxhuc[Random.nextInt(2)])
            sioaskddsok += 1

            if(dopdsokf.drawable.constantState == ContextCompat.getDrawable(this@Xoxpxisudys, R.drawable.av_ranger_plane)?.constantState){
                kookkxco +=1
                cixcjvji.text = "Found Avia : $kookkxco"
            }
            if(sioaskddsok == 6){
               startActivity(Intent(this@Xoxpxisudys,Skccxjcucxuxchd::class.java)
                   .putExtra("score",kookkxco)
               )
            }

        }
        zozozzijxxuzh.setOnClickListener {
            zozozzijxxuzh.setImageResource(lishjzxhuc[Random.nextInt(2)])
            sioaskddsok += 1
            if(zozozzijxxuzh.drawable.constantState == ContextCompat.getDrawable(this@Xoxpxisudys, R.drawable.av_ranger_plane)?.constantState){
                kookkxco +=1
                cixcjvji.text = "Found Avia : $kookkxco"
            }
            if(sioaskddsok == 6){
                startActivity(Intent(this@Xoxpxisudys,Skccxjcucxuxchd::class.java)
                    .putExtra("score",kookkxco)

                )
            }
        }
        siosjsijd.setOnClickListener {
            siosjsijd.setImageResource(lishjzxhuc[Random.nextInt(2)])
            sioaskddsok += 1

            if(siosjsijd.drawable.constantState == ContextCompat.getDrawable(this@Xoxpxisudys, R.drawable.av_ranger_plane)?.constantState){
                kookkxco +=1
                cixcjvji.text = "Found Avia : $kookkxco"
            }
            if(sioaskddsok == 6){
                startActivity(Intent(this@Xoxpxisudys,Skccxjcucxuxchd::class.java)
                    .putExtra("score",kookkxco)
                )
            }

        }
        kciocjvji.setOnClickListener {
            kciocjvji.setImageResource(lishjzxhuc[Random.nextInt(2)])
            sioaskddsok += 1
            if(kciocjvji.drawable.constantState == ContextCompat.getDrawable(this@Xoxpxisudys, R.drawable.av_ranger_plane)?.constantState){
                kookkxco +=1
                cixcjvji.text = "Found Avia : $kookkxco"
            }
            if(sioaskddsok == 6){
                startActivity(Intent(this@Xoxpxisudys,Skccxjcucxuxchd::class.java)
                    .putExtra("score",kookkxco)
                )
            }

        }

        fofkokggf.setOnClickListener {
            fofkokggf.setImageResource(lishjzxhuc[Random.nextInt(2)])
            sioaskddsok += 1
            if(fofkokggf.drawable.constantState == ContextCompat.getDrawable(this@Xoxpxisudys, R.drawable.av_ranger_plane)?.constantState){
                kookkxco +=1
                cixcjvji.text = "Found Avia : $kookkxco"
            }
            if(sioaskddsok == 6){
                startActivity(Intent(this@Xoxpxisudys,Skccxjcucxuxchd::class.java)
                    .putExtra("score",kookkxco)
                )
            }

        }

        ockcvchuvcu.setOnClickListener {
            ockcvchuvcu.setImageResource(lishjzxhuc[Random.nextInt(2)])
            sioaskddsok += 1
            if(ockcvchuvcu.drawable.constantState == ContextCompat.getDrawable(this@Xoxpxisudys, R.drawable.av_ranger_plane)?.constantState){
                kookkxco +=1
                cixcjvji.text = "Found Avia : $kookkxco"
            }
            if(sioaskddsok == 6){
                startActivity(Intent(this@Xoxpxisudys,Skccxjcucxuxchd::class.java)
                    .putExtra("score",kookkxco)
                )
            }

        }


    }
}