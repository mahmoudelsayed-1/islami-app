package com.example.islami_app.chapterDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.islami_app.Constants
import com.example.islami_app.databinding.ActivityQuranDetaillsBinding

class SuraDetailsActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityQuranDetaillsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityQuranDetaillsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initParameters()
        initViews()
        loadSuraAsset()
    }

    private fun initViews() {
        setSupportActionBar(viewBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)   // دول عشان اعمل زرار الباك
        viewBinding.titleTv.text = suraName
        setTitle("")
    }


    override fun onSupportNavigateUp(): Boolean {
        finish()

        //onBackPressed()
        return true
    }

    private fun loadSuraAsset() {
        val fileContent = assets.open("$suraPosition.txt").bufferedReader().use { it.readText() }

        val lines = fileContent.trim().split("\n")

        bindVerse(lines)
    }

    lateinit var adapter: VersesAdapter
    private fun bindVerse(verses: List<String>) {
        adapter = VersesAdapter(verses)

        viewBinding.content.surasRecycler.adapter = adapter
    }

    lateinit var suraName: String
    var suraPosition: Int = 0
    private fun initParameters() {
        suraName = intent.getStringExtra(Constants.EXTRA_SURA_NAME) ?: ""
        suraPosition = intent.getIntExtra(Constants.EXTRA_SURA_INDEX, 0)
    }
}