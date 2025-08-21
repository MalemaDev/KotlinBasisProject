package edu.unicatolica.kotlin

import org.w3c.dom.css.Counter
import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max


fun section (title: String) {

    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))



}


fun variablesAndTypes () {
    section("1) variables and types")
    val lang: String = "Kotlin"
    var counter = 0


    println("val lang = $lang")
    println("val counter = $counter")
    counter += 3
    println("Counter after += $ == $counter")
}

fun conditionalAndExpressions (n: Int) {

    section("2) Conditional as expressions & when")

    val parity = if (n % 2 == 0) "even" else "odd"
    println("n = $n as $parity")

    val description = when {

        n == 0 -> "zero"
        n in 1..9 -> "One digit positive"
        n < 0 -> "negative"
        else -> "positive (>=10)"
    }
    println("description = $description")
}

fun loopsDemo () {
    section("3) Loops: for  / while / do-while ")


    //Always use when you know the range of the elements
    print("for 1 to 5: ")
    for (i in 1..5) print("$i")
    println()


    val list = listOf("a", "b", "c")
    print("for over list: ")
    for (x in list) print("$x ")


    /*
        use when you don´t know the range of elements but you know a stop condition

    */
    var x = 3
    print("While x>0:")
    while(x>0){
        print("$x")
        x--
    }
    println()


    //runs at leat once

    var y = 0
    print("do-while y<1")

    do {
        print("$y")
        y++
    } while (y < 0)
    println()

}














fun main () {


   /* variablesAndTypes()
    conditionalAndExpressions(15)*/
    operacion()




}