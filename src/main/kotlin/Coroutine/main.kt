package Coroutine

import kotlinx.coroutines.*

fun main () {
    GlobalScope.launch {
        delay(1000L)
        println("Naoto.")
    }
    println("My name is")
    Thread.sleep(2000L)
}