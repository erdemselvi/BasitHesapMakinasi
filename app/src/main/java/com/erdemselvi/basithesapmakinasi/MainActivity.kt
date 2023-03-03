package com.erdemselvi.basithesapmakinasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var s1:Int?=null
    var s2:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun toplama(view: View){
        s1=editText.text.toString().toIntOrNull()
        s2=editText2.text.toString().toIntOrNull()
        if(s1==null || s2==null){
            textView.text="Sayıyı girmeyi unutmayın"
        }
        else {
            textView.text = "Sonuç= ${s1!! + s2!!}"
        }
    }
    fun cikarma(view:View){
        s1=editText.text.toString().toIntOrNull()
        s2=editText2.text.toString().toIntOrNull()
        if(s1==null || s2==null){
            textView.text="Sayıyı girmeyi unutmayın"
        }
        else {
            textView.text = "Sonuç= ${s1!! - s2!!}"
        }
    }
    fun carpma(view: View){
        s1=editText.text.toString().toIntOrNull()
        s2=editText2.text.toString().toIntOrNull()
        if(s1==null || s2==null){
            textView.text="Sayıyı girmeyi unutmayın"
        }
        else {
            textView.text = "Sonuç= ${s1!! * s2!!}"
        }
    }
    fun bolme(view:View){
        s1=editText.text.toString().toIntOrNull()
        s2=editText2.text.toString().toIntOrNull()
        if(s1==null || s2==null){
            textView.text="Sayıyı girmeyi unutmayın"
        }
        else {
            textView.text = "Sonuç= ${s1!!.toDouble() / s2!!.toDouble()}"
        }
    }
}