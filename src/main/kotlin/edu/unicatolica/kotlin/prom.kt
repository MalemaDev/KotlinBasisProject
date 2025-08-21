package edu.unicatolica.kotlin


fun operacion () {

    val Matematicas = 5.0
    val Calculo = 4.6
    val Ciencias = 4.0

    val calculo = Matematicas + Calculo + Ciencias
    val promedio = calculo.toDouble() / 3

    println("tu promedio en la mater $promedio")




    when {


        promedio === 3.0 -> println("Has pasado la materia de manera raspada")
        promedio >= 4.0 -> println("Has pasado la materia con un buen promedio")
        promedio === 5.0 -> println("Has pasado la materia con un promedio sobresaliente")

        else -> println("Tu promedio es reprobado")
    }

}

fun main () {
    operacion()
}