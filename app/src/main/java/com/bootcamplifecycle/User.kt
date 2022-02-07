package com.bootcamplifecycle

import java.io.Serializable

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 4.02.2022                │
//└──────────────────────────┘

//Data Class içine veri yerleştirilecek(Set işlemi),Veriyi çekmek isteyeceğim(Get işlemi)Getter-Setter Kavramı
//get ve set işlemlerini arka planda yapıyor.(Kotlin'de)
//Serializable,Parametre olarak girilen değerlerin her yerde kullanılabilmesini sağlayan
// yapı.Girilen değişken türünü byte code'larla saklayıp her fragment/activity de çağırabilmeyi sağlayan yapı
data class User(
    val name:String,
    val age:Int
                ):Serializable