package gr.gkortsaridis.mobilecomputingdemolab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gr.gkortsaridis.mobilecomputingdemolab03.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.calculateBmiButton.setOnClickListener {
            val weight = binding.weightInput.text.toString().toDouble()
            val height = binding.heightInput.text.toString().toDouble()
            val bmi = weight / height.pow(2.0)

            binding.resultLabel.text = "Your BMI is $bmi"
        }
    }
}