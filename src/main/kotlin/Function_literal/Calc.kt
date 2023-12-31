package Function_literal

val calc: (Int, Int)->Int = {num1,num2 -> num1 + num2}

val square: (Int)->Int = {it * it}
val square2: (Int)->Int = fun(num:Int):Int {return num*num}

typealias Calc = (Int,Int) -> Int

fun printCalcResult(num1:Int,num2:Int,calculation:Calc) {
    val result = calculation(num1,num2)
    println(result)
}

fun Int.square():Int = this*this