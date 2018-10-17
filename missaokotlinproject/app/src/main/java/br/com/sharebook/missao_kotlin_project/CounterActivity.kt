package br.com.sharebook.missao_kotlin_project

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        setSupportActionBar(toolbar)

        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->

            //val tx: TextView = txCounter
            val tx: TextView = findViewById<View>(R.id.txCounter) as TextView
            val old = tx.text.toString().toInt()
            val new = old + 1
            tx.text = new.toString()

            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
