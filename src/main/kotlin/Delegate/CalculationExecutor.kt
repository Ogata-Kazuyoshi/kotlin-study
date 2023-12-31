package Delegate

interface CalculationExecutor {
    val message:String
    fun calc(num1:Int,num2:Int):Int
    fun printStartMessage()
}

class CommonCalculationExecutor(override val message:String = "calc"):CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not implements calc")
    }

    override fun printStartMessage() {
        println("start $message")
    }
}

class AddCalculationExecutor(private val calculationExecutor:CalculationExecutor):CalculationExecutor by calculationExecutor{

    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}