package com.bootcamplifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bootcamplifecycle.databinding.ActivityUserInformationBinding

class UserInformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Binding
        binding = ActivityUserInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
       //Gönderilen dataları almak
        val getName = intent.getStringExtra("isim")
        val getAge = intent.getIntExtra("yas", 0)
//Data Class ile veri çekme
        val getUser=intent.getSerializableExtra("kullanici") as User

       //edit text lerimizde göstermek
        //binding.tvName.text=getName  //kullanılmadan
       binding.tvName.text= getUser.name //Data class kullanılarak
       // binding.tvAge.text= getAge.toString()
       binding.tvAge.text= getUser.age.toString()
    }
}