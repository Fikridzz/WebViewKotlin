package com.example.fikridzakwan.webviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.fikridzakwan.webviewkotlin.R.id.layoutWebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutWebView.settings.javaScriptEnabled
        layoutWebView.loadUrl("https://idn.sch.id/")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_web_view, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when (item?.itemId) {

        R.id.webProfile -> {
            layoutWebView.loadUrl("https://www.instagram.com/theztztzt_/")
            true
        }

        R.id.webSekolah -> {
            layoutWebView.loadUrl("https://idn.sch.id/")
            true
        }

        R.id.webTarget -> {
            layoutWebView.loadUrl("https://docs.google.com/spreadsheets/d/1RO-Qo7T9cwuY8utZnDCllt3ZuOao5CZtxcyOIFCA8ww/edit#gid=0/")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
