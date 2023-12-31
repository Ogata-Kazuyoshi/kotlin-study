package if_when

fun printOddOrEvenNumberText(num:Int) {
    var text = ""
    if (num % 2  == 1) {
        text = "奇数"
    } else {
        text = "偶数"
    }
    println(text)
}