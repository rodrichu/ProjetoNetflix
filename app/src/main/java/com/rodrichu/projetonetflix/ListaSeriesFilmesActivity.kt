package com.rodrichu.projetonetflix

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ListaSeriesFilmesActivity : AppCompatActivity()
{
    private lateinit var textMaisDetalhes: TextView
    /*private lateinit var darkWindsDetalhes: ImageView
    private lateinit var loveSpectrumDetalhes: ImageView
    private lateinit var bloodZeusDetalhes: ImageView
    private lateinit var dragonPrinceDetalhes: ImageView*/
    private lateinit var frieren: Serie
    private lateinit var darkWinds: Serie
    private lateinit var loveSpectrum: Serie
    private lateinit var bloodZeus: Serie
    private lateinit var dragonPrince: Serie

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_series_filmes)

        frieren = Serie( // Agora inicializando a variável da classe
            nome = "Frieren e a Jornada para o Além",
            descricao = "Após uma missão de 10 anos ao lado do herói Himmel e seu grupo...",
            imagem = "frieren_thumb"
        )

        darkWinds = Serie( // Agora inicializando a variável da classe
            nome = "Dark Winds",
            descricao = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Amet consectetur adipiscing elit quisque faucibus ex sapien. Quisque faucibus ex sapien vitae pellentesque sem placerat. Vitae pellentesque sem placerat in id cursus mi....",
            imagem = "dark_winds_promo"
        )

        loveSpectrum = Serie( // Agora inicializando a variável da classe
            nome = "Love on the Spectrum",
            descricao = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Amet consectetur adipiscing elit quisque faucibus ex sapien. Quisque faucibus ex sapien vitae pellentesque sem placerat. Vitae pellentesque sem placerat in id cursus mi....",
            imagem = "love_on_the_spectrum"
        )

        bloodZeus = Serie( // Agora inicializando a variável da classe
            nome = "Blood Of Zeus",
            descricao = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Amet consectetur adipiscing elit quisque faucibus ex sapien. Quisque faucibus ex sapien vitae pellentesque sem placerat. Vitae pellentesque sem placerat in id cursus mi....",
            imagem = "blood_of_zeus"
        )

        dragonPrince = Serie( // Agora inicializando a variável da classe
            nome = "The Dragon Prince",
            descricao = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Amet consectetur adipiscing elit quisque faucibus ex sapien. Quisque faucibus ex sapien vitae pellentesque sem placerat. Vitae pellentesque sem placerat in id cursus mi....",
            imagem = "the_dragon_prince"
        )


        this.inicializarComponentesInterface()

        textMaisDetalhes.setOnClickListener {
            val intent =
                Intent(this, DetalhesActivity::class.java) // Agora chamando a Activity correta
            intent.putExtra("SERIE", frieren) // Primeiro passamos o objeto
            startActivity(intent) // Agora iniciamos a Activity
        }

        /*

        this.inicializarComponentesInterface()

        darkWindsDetalhes.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java) // Agora chamando a Activity correta
            intent.putExtra("SERIE", darkWinds) // Primeiro passamos o objeto
            startActivity(intent) // Agora iniciamos a Activity
        }

        this.inicializarComponentesInterface()

        loveSpectrumDetalhes.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java) // Agora chamando a Activity correta
            intent.putExtra("SERIE", loveSpectrum) // Primeiro passamos o objeto
            startActivity(intent) // Agora iniciamos a Activity
        }

        this.inicializarComponentesInterface()

        bloodZeusDetalhes.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java) // Agora chamando a Activity correta
            intent.putExtra("SERIE", bloodZeus) // Primeiro passamos o objeto
            startActivity(intent) // Agora iniciamos a Activity
        }

        this.inicializarComponentesInterface()

        dragonPrinceDetalhes.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java) // Agora chamando a Activity correta
            intent.putExtra("SERIE", dragonPrince) // Primeiro passamos o objeto
            startActivity(intent) // Agora iniciamos a Activity
        }

    }*/


    }

    private fun inicializarComponentesInterface()
    {
        textMaisDetalhes = findViewById(R.id.irParaDetalhes)
        /* darkWindsDetalhes = findViewById(R.id.darkWindsDetalhes)
        loveSpectrumDetalhes = findViewById(R.id.loveSpectrumDetalhes)
        bloodZeusDetalhes = findViewById(R.id.bloodZeusDetalhes)
        dragonPrinceDetalhes = findViewById(R.id.dragonPrinceDetalhes)

     */
    }

}