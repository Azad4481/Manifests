package com.example.basic_design

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basic_design.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CompoundButton.OnCheckedChangeListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switchBtr.setOnCheckedChangeListener(this@MainActivity)



    }

    override fun onCheckedChanged(p0: CompoundButton?, isCheeked: Boolean) {
      if (isCheeked==true){
          Toast.makeText(this@MainActivity, "Switch is On ", Toast.LENGTH_SHORT).show()
      }
        else{
          Toast.makeText(this, "Switch is off", Toast.LENGTH_SHORT).show()
        }
    }
}