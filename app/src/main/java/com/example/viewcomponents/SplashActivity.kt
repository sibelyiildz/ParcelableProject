package com.example.viewcomponents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     17/02/2020 - 14:52     ║
╚════════════════════════════╝
 */

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) //SplashActivity'in xml'ini bağlıyoruz burada

//        val btnOpenMainactivity = findViewById<Button>(R.id.btnOpenMainactivity)

        btnOpenMainactivity.text = "assfds"
        btnOpenMainactivity.setOnClickListener {


            val intent = Intent(
                this,
                MainActivity::class.java
            )   //activity değiştirmek için( this bulunduğumuz yer, diğer değişken gidilecek yer)

            val userProfile = UserProfile("Sibel", 22, true)


//            intent.putExtra("KEY_NAME", userProfile.keyName)   //Aşağıdaki bunun gibi aslında
//            intent.putExtra(UserProfileType.KEY_NAME.name, userProfile.keyName)

//            val bundle = Bundle()
//            bundle.putInt(UserProfileType.KEY_AGE.name, userProfile.keyAge)
//            bundle.putBoolean(UserProfileType.KEY_IS_MALE.name, userProfile.keyIsMale)
//              intent.putExtras(bundle)

            intent.putExtra("keyUserProfile", userProfile)

            startActivity(intent)
            finish()  // Yeni activity'e geçildikten sonra geri tuşuna basınca eski activity'e dönmez. Arkada kalan ölür.
        }
    }
}