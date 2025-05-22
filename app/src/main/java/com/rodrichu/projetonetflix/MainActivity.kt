package com.rodrichu.projetonetflix

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{

    private lateinit var textInputEmail: EditText

    private lateinit var textInputSenha: EditText

    private lateinit var buttonEntrar: Button
    private lateinit var textValidador: TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        this.inicializarComponentesInterface()
            buttonEntrar.setOnClickListener {
                verificarLoginSenha()
            }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    @SuppressLint("SetTextI18n")


    private fun verificarLoginSenha()
    {
        val email = textInputEmail.text.toString().trim()
        val senha = textInputSenha.text.toString().trim()

        if ( email.isEmpty() ) {
            textInputEmail.error = "Digite seu e-mail ou telefone"
        }
        else {
            textInputEmail.error = null
        }

        if ( senha.isEmpty() ) {
            textInputSenha.error = "Digite sua senha"
        }
        else {
            textInputSenha.error = null
        }

        if (email == "teste@netflix.com" && senha == "netflix123") {
            textValidador.text = "" // Limpa o texto antes de mudar de Activity
            val intent = Intent(this, ListaSeriesFilmesActivity::class.java)
            startActivity(intent)
        }

        else{
            textValidador.text = "Login ou senha incorretos"
        }
    }

    private fun inicializarComponentesInterface()
    {
        textInputEmail = findViewById(R.id.text_input_email)
        textInputSenha = findViewById(R.id.text_input_senha)
        buttonEntrar = findViewById(R.id.button_entrar)
        textValidador = findViewById(R.id.text_validador)
    }
}