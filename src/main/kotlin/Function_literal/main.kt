package Function_literal

fun main () {
    println(calc(1,10))
    println("squareの計算結果: ${square(4)}")
    println("squareの計算結果: ${square2(6)}")
    printCalcResult(10,20) {num1,num2 -> num1+num2}
    println("拡張関数を使用した： ${10.square()}")
}
