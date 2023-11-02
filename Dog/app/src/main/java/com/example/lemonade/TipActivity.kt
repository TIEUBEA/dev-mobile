package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import com.example.lemonade.databinding.ActivityTipBinding
import kotlin.math.roundToInt

class TipActivity : AppCompatActivity() {
    lateinit var binding: ActivityTipBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnCalculer.setOnClickListener{
            calculate(binding.swtarrondir)
        }
     }

    private fun calculate(view : Switch) {

        var pourcentage = when(binding.radioGroup.checkedRadioButtonId){
            R.id.check_amazing -> 0.2
            R.id.check_good -> 0.18
            else -> 0.15
        }
        if (view.isChecked){
            var pourBoire = (binding.countService.text.toString().toDouble() * pourcentage).roundToInt()
            binding.txtResult.text = "Amount Tip: $" + pourBoire.toString()

        }else{
            var pourBoire = (binding.countService.text.toString().toDouble() * pourcentage)
            binding.txtResult.text = "Amount Tip: $" + pourBoire.toString()
        }
    }
}