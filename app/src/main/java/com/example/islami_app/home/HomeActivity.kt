package com.example.islami_app.home

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.islami_app.R
import com.example.islami_app.databinding.ActivityHomeBinding
import com.example.islami_app.home.hadeth.HadethFragment
import com.example.islami_app.home.quran.QuranFragment
import com.example.islami_app.home.radio.RadioFragment
import com.example.islami_app.home.tasbeh.TasbehFragment
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        viewBinding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)
        viewBinding.content.bottomNav.setOnItemSelectedListener(object :
            NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {

                when (item.itemId) {

                    R.id.nav_quran -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, QuranFragment())
                            .commit()

                    }

                    R.id.nav_hadeth -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, HadethFragment())
                            .commit()

                    }

                    R.id.nav_tasbeh -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, TasbehFragment())
                            .commit()

                    }

                    R.id.nav_radio -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, RadioFragment())
                            .commit()

                    }


                }
                return true    //كده الايتيم اتعمله سيليكتيد

            }

        })
        viewBinding.content.bottomNav.selectedItemId = R.id.nav_quran
    }

}