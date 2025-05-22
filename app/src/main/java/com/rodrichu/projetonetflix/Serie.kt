package com.rodrichu.projetonetflix
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Serie (
    val nome: String,
    val descricao: String,
    val imagem: String
) : Parcelable