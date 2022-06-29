package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnCalculation.setOnClickListener {

         var addNum=binding.txtAddNum.text.toString().toInt()


         var addNum2=binding.txtAddNum2.text.toString().toInt()
            val result= addNum + addNum2

            binding.txtResult.setText(""+result)


            var subNum=binding.txtSubNum.text.toString().toInt()


            var subNum2=binding.txtSubNum2.text.toString().toInt()
            val subresult= subNum - subNum2

            binding.txtResult2.setText(""+subresult)





        }
    }
}