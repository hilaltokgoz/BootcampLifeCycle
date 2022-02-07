package com.bootcamplifecycle

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bootcamplifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.setUserButton.setOnClickListener {
         val nameInput= binding.nameEditText.text.toString()
            val ageInput=binding.ageEditText.text.toString().toInt()
         val newUser=User(nameInput,ageInput)

            //Activity'leri bağlamak
            val intent = Intent(this, UserInformationActivity::class.java)
            //Verileri göndermek
            //key olarak isim ve yas girdik alırken onları kullanacağız.
            intent.putExtra("isim",nameInput)
            intent.putExtra("yas",ageInput )
            intent.putExtra("kullanici",newUser)//Data class'la veri gönderme
            startActivity(intent)
        }

//LifeCycle döngüsünü görmek için
        Log.d("MainActivity", "onCreate() çalıştı.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart() çalıştı.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume() çalıştı.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause() çalıştı.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart() çalıştı.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop() çalıştı.")
    }

    //uygulama kapatılırken kullanıcının girdiği verileri database e kaydetmek için kullanılır.
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy() çalıştı.")
    }

    ///Telefon yan çevrildiğinde,otomatik olarak kapanıp açılır arka planda
    //Girilen veriler de bundan kaynaklı kayboluyor.(Eğer id si yoksa)
    //id varsa telefon yana çevrildiğinde de girilen data lar kaybolmaz.(Android artık tanıyor)
    //Telefon yana çevrildiğinde çalışcak işlemleri yazmak için kullanılır.
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MainActivity", "onSaveInstanceState() çalıştı.")
    }

    //Geri tuşuna basıldığında yapılmasını istediğimiz işlemleri burada yazarız
    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("MainActivity", "onBackPressed() çalıştı.")
        //Uygulamadan çıkmak ister misiniz? gibi bir alertDialog buraya konulabilir.
    }
}