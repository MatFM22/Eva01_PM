package com.aquino.matias.usolayoutsv4

import org.junit.Test

// Aquino Basilio, Matias

class Ejercicio01Kotlin {
    // función para validar palalbras anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {

        // Condicional para verificar si las palabras son anagramas, por medio de la cantidad de palabras
        if (palabra1.length != palabra2.length) {
            return false
        }

        // Se convierte las palabras a listas de caracteres, se ordenan para luego compararlas
        // Si las palabras llegan a tener las mismas letras con una frecuencia simirlar entre si, entonces las listas serán iguales
        val palabra1Ordenada = palabra1.toCharArray().sorted()
        val palabra2Ordenada = palabra2.toCharArray().sorted()

        // Se devuelve el resutlado al comparar ambas palabras
        return palabra1Ordenada == palabra2Ordenada
    }

    @Test
    // Función principal para validar la función anagrama
    fun main() {

        val palabra1 = "listen"
        val palabra2 = "silent"
        println("$palabra1 y $palabra2 son anagramas? ${sonAnagramas(palabra1, palabra2)}")


        val palabra3 = "hello"
        val palabra4 = "world"
        println("$palabra3 y $palabra4 son anagramas? ${sonAnagramas(palabra3, palabra4)}")

        val palabra5 = "Aquino"
        val palabra6 = "Noaqui"
        println("$palabra5 y $palabra6 son anagramas? ${sonAnagramas(palabra1, palabra2)}")

    }

}


