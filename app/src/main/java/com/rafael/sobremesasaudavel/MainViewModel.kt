package com.rafael.sobremesasaudavel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
    val frutas = arrayOf(
        "Abacaxi ${getEmoji(0x1F34D)}",
        "Banana ${getEmoji(0x1F34C)}",
        "Maçã ${getEmoji(0x1F34E)}",
        "Melancia ${getEmoji(0x1F349)}",
        "Morango ${getEmoji(0x1F353)}",
        "Tangerina ${getEmoji(0x1F34A)}",
        "Uva ${getEmoji(0x1F347)}"
    )

    private val _fruta = MutableLiveData<String>()
    val frutaEscolhida: LiveData<String>
    get() = _fruta

    fun sortearFruta() {
        var numeroFrutasArray = frutas.size
        var numeroAleatorio = Random.nextInt(numeroFrutasArray)
        _fruta.value = frutas[numeroAleatorio].toString()
    }

    fun getEmoji(unicode: Int) : String {
        return String(Character.toChars(unicode))
    }
}