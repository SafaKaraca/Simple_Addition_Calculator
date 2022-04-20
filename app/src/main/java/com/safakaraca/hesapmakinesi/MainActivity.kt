package com.safakaraca.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safakaraca.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        var birinciSayi = ""
        var ikinciSayi: String
        var sonuc = 0

        // SIFIRLAMA BUTONU(C)
        tasarim.buttonSifirla.setOnClickListener {
            tasarim.sayiGoster.text = "0" // C'ile sıfırlamak için
            birinciSayi="0"
            ikinciSayi="0"
            sonuc = 0
            tasarim.sayiCount.text = "Birinci Sayı: " //Her sıfırladığımızda tekrar ilk sayıyı istemesi için
        }

        //SAYI BUTONLARI
        tasarim.buttonSifir.setOnClickListener {
            tasarim.sayiGoster.text = sayiEkleme("0")
        }
        tasarim.buttonBir.setOnClickListener {
            if(tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "1"
            }else{
                tasarim.sayiGoster.text = sayiEkleme("1")
            }
            if(sonuc!=0){//işlem bittiğinde tekrar değerleri sıfırlayıp yeni işlem yapabilmek için
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="1"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonIki.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "2"
            }else{
                tasarim.sayiGoster.text = sayiEkleme("2")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="2"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonUc.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "3"
            }else{
                tasarim.sayiGoster.text = sayiEkleme("3")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="3"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonDort.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "4"
            }else{
            tasarim.sayiGoster.text = sayiEkleme("4")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="4"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonBes.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "5"
            }else{
            tasarim.sayiGoster.text = sayiEkleme("5")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="5"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonAlti.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "6"
            }else{
            tasarim.sayiGoster.text = sayiEkleme("6")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="6"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonYedi.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "7"
            }else{
            tasarim.sayiGoster.text = sayiEkleme("7")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="7"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonSekiz.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "8"
            }else{
            tasarim.sayiGoster.text = sayiEkleme("8")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="8"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonDokuz.setOnClickListener {
            if (tasarim.sayiGoster.text=="0"){
                tasarim.sayiGoster.text = "9"
            }else{
            tasarim.sayiGoster.text = sayiEkleme("9")
            }
            if(sonuc!=0){
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="9"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }

        //İŞLEM BUTONLARI
        tasarim.buttonTopla.setOnClickListener {
            birinciSayi= tasarim.sayiGoster.text.toString()
            tasarim.sayiGoster.text = "0"
            tasarim.sayiCount.text = "İkinci Sayi"
            println("birinci sayi: $birinciSayi")//log kontrolü
            if(sonuc!=0){//Kalan sonucu birinci sayı olarak almaması için
                birinciSayi=""
                ikinciSayi=""
                sonuc=0
                tasarim.sayiGoster.text="0"
                tasarim.sayiCount.text="Birinci Sayi: "
            }
        }
        tasarim.buttonEsittir.setOnClickListener {
            ikinciSayi=tasarim.sayiGoster.text.toString()
            sonuc=birinciSayi.toInt()+ikinciSayi.toInt()
            tasarim.sayiCount.text = "Sonuç"
            println("ikinci sayi: $ikinciSayi")//log kontrolü
            tasarim.sayiGoster.text = sonuc.toString()
            println("sonuc sayi: $sonuc")//log kontrolü
            birinciSayi="0"
            ikinciSayi="0"
        }
    }

    private fun sayiEkleme(buttonValue: String): String {//Aynı sayıyı tekrar ekleyebilmek için
        return "${tasarim.sayiGoster.text}$buttonValue"
    }
}