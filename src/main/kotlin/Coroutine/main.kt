package Coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main () {
//    1.
//    GlobalScope.launch {
//        delay(1000L)
//        println("Naoto.")
//    }
//    println("My name is")
//    Thread.sleep(2000L)

//    2.
//    runBlocking {
//        launch {
//            delay(1000L)
//            println("Naoto")
//        }
//        println("My name is")
//    }
//    println("task finished!!!")

//    3.
//    runBlocking {
//        val result = async {
//            delay(2000L)
//            var sum = 0
//            for (i in 1..10) {
//                sum += i
//            }
//            sum
//        }
//        println("計算中・・・")
//        println("sum = ${result.await()}")
//    }

//    4.
//    runBlocking {
//        val num1 = async {
//            delay(2000L)
//            3+4
//        }
//        val num2 = async {
//            delay(4000L)
//            1+2
//        }
//        println("計算中・・・")
//        println("計算結果：${num1.await()}, ${num2.await()}")
//    }

//    5.
//    runBlocking {
//        val time = measureTimeMillis {
//            val task1 = async { doTask("Task1",1000) }
//            val task2 = async { doTask("Task2",2000) }
//            val task3 = async { doTask("Task3",3000) }
//            println(task1.await())
//            println(task2.await())
//            println(task3.await())
//        }
//        println("全タスクの実行時間 : ${time} ms")
//    }

//    6.
    runBlocking {
        val job = launch {
            repeat(1000) { i ->
                println("I'm sleeping ${i} ...")
                delay(500L)
            }
        }
        delay(1300L)
        println("main: I'm tired of waiting!")
        job.cancel()
        job.join()
        println("main: Now I can quit!")
    }
}