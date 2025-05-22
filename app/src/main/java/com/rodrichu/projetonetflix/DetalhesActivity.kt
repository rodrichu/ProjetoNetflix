package com.rodrichu.projetonetflix

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import  android.os.Build

class DetalhesActivity : AppCompatActivity()
{
    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val serie: Serie? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("SERIE", Serie::class.java) // Para Android 13+
        } else {
            intent.getParcelableExtra("SERIE") // Para versões mais antigas
        }


        val textNome: TextView = findViewById(R.id.nome_detalhes)
        val textDescricao: TextView = findViewById(R.id.descricao_detalhes)
        val imagemSerie: ImageView = findViewById(R.id.imagem_detalhes)

        if (serie != null) {
            textNome.text = serie.nome
            textDescricao.text = serie.descricao

            if (serie.imagem.isNotEmpty()) {
                val resourceId = resources.getIdentifier(serie.imagem, "drawable", packageName)

                if (resourceId != 0) {
                    imagemSerie.setImageResource(resourceId)
                } else {
                    imagemSerie.setImageResource(R.drawable.ic_launcher_foreground)
                }
            } else {
                imagemSerie.setImageResource(R.drawable.ic_launcher_foreground)
            }

            val resourceId = resources.getIdentifier(serie.imagem, "drawable", packageName)

            if (resourceId != 0) {
                imagemSerie.setImageResource(resourceId)
            } else {
                imagemSerie.setImageResource(R.drawable.ic_launcher_foreground) // Placeholder
            }
        }


    }
}