package com.example.animeapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OptionsPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_options_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cardView1 = findViewById<CardView>(R.id.card1)
        val cardView2 = findViewById<CardView>(R.id.card2)
        val cardView3 = findViewById<CardView>(R.id.card3)
        val cardView4 = findViewById<CardView>(R.id.card4)
        val cardView5 = findViewById<CardView>(R.id.card5)
        val cardView6 = findViewById<CardView>(R.id.card6)

        cardView1.setOnClickListener {
            val intent = Intent(this, GogoActivity::class.java)
            Toast.makeText(applicationContext, "Loading url...", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        cardView2.setOnClickListener {
            val intent = Intent(this, Gogo2Activity::class.java)
            Toast.makeText(applicationContext, "Loading url...", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        cardView3.setOnClickListener {
            val intent = Intent(this, AnimeTvActivity::class.java)
            Toast.makeText(applicationContext, "Loading url...", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        cardView4.setOnClickListener {
            val intent = Intent(this, MangaTvActivity::class.java)
            Toast.makeText(applicationContext, "Loading url...", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        cardView5.setOnClickListener {
            val intent = Intent(this, MyAnimeListActivity::class.java)
            Toast.makeText(applicationContext, "Loading url...", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        cardView6.setOnClickListener {
            val intent = Intent(this, GenshinImpactActivity::class.java)
            Toast.makeText(applicationContext, "Loading url...", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        val buttonHelp = findViewById<Button>(R.id.btnHelp)
        buttonHelp.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mail to:") // Only email apps should handle this
                putExtra(Intent.EXTRA_EMAIL, arrayOf("unimpairedx@gmail.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Subject of the email")
                putExtra(Intent.EXTRA_TEXT, "Body of the email")
            }

            if (emailIntent.resolveActivity(packageManager) != null) {
                startActivity(emailIntent)
            }
        }
    }
}